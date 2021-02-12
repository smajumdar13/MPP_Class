package project2.dataaccess;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

import project2.business.Book;
import project2.business.LibraryMember;
import project2.business.Periodical;

public class DataAccessFacade implements DataAccess {
	
	enum StorageType {
		BOOKS, PERIODICALS, MEMBERS;
	}
	
	public static final String OUTPUT_DIR = System.getProperty("user.dir") 
			+ "\\src\\project2\\dataaccess\\storage";
	public static final String DATE_PATTERN = "MM/dd/yyyy";
	
	private static HashMap<String,Book> books;
	private static HashMap<Pair<String, Integer>,Periodical> periodicals;
	private static HashMap<String, LibraryMember> members;
	
	////specialized lookup methods
	public LibraryMember searchMember(String memberId) {
		HashMap<String, LibraryMember> mems = readMemberMap();
		if(mems.containsKey(memberId)) {
			return mems.get(memberId);
		}
		return null;
	}
	
	public Book searchBook(String isbn) {
		HashMap<String,Book> booksMap =  readBooksMap();
		return booksMap.get(isbn);
	}
	public Periodical searchPeriodical(String title, int issueNum) {
		HashMap<Pair<String, Integer>, Periodical> periodicalsMap =  readPeriodicalsMap();
		return periodicalsMap.get(new Pair<String, Integer>(title, issueNum));
	}
	
	
	
	///////save methods
	//saveNewMember
	public void saveNewMember(LibraryMember member) {
		HashMap<String, LibraryMember> mems = readMemberMap();
		String memberId = member.getMemberId();
		mems.put(memberId, member);
		members = mems;
		saveToStorage(StorageType.MEMBERS, mems);	
	}
	
	public void updateMember(LibraryMember member) {
		saveNewMember(member);
	}
	
	//save new lendable item
	public void saveNewBook(Book book) {
		HashMap<String, Book> bookMap = readBooksMap();
		String isbn = book.getIsbn();
		bookMap.put(isbn, book);
		books = bookMap;
		saveToStorage(StorageType.BOOKS, bookMap);	
	}
	
	public void saveNewPeriodical(Periodical periodical) {
		HashMap<Pair<String, Integer>, Periodical> periodMap = readPeriodicalsMap();
		Pair<String, Integer> periodKey = new Pair(periodical.getTitle(), periodical.getIssueNumber());
		periodMap.put(periodKey, periodical);
		periodicals = periodMap;
		saveToStorage(StorageType.PERIODICALS, periodMap);	
	}
	
	
	
	
	
	//////read methods that return full maps
	///// programming idiom: when saves are done, the corresponding map
	////  is updated, then saved to storage, so when a read is done
	////  it is not necessary to retrieve from storage -- just read
	////  the map provided in this class
	
	
	@SuppressWarnings("unchecked")
	public  HashMap<String,Book> readBooksMap() {
		if(books == null) {
			books = (HashMap<String,Book>) readFromStorage(StorageType.BOOKS);
		}
		
		return books;
	}
	@SuppressWarnings("unchecked")
	public HashMap<Pair<String,Integer>, Periodical> readPeriodicalsMap() {
		if(periodicals == null) {
			periodicals = (HashMap<Pair<String,Integer>, Periodical>) readFromStorage(
				StorageType.PERIODICALS);
		}
		return periodicals;
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String, LibraryMember> readMemberMap() {
		if(members == null) {
			members = (HashMap<String, LibraryMember>) readFromStorage(
					StorageType.MEMBERS);
		}
		return members;
	}
	
	
	/////load methods - these place test data into the storage area
	///// - used just once at startup  
	public static void loadMemberMap(List<LibraryMember> memberList) {
		members = new HashMap<String, LibraryMember>();
		memberList.forEach(member -> members.put(member.getMemberId(), member));
		saveToStorage(StorageType.MEMBERS, members);
	}
	public static void loadBookMap(List<Book> bookList) {
		books = new HashMap<String, Book>();
		bookList.forEach(book -> books.put(book.getIsbn(), book));
		saveToStorage(StorageType.BOOKS, books);
	}
	public static void loadPeriodicalsMap(List<Periodical> periodicalList) {
		periodicals = new HashMap<Pair<String, Integer>, Periodical>();
		periodicalList.forEach(
			p -> periodicals.put(new Pair<String,Integer>(p.getTitle(), p.getIssueNumber()), p));
		saveToStorage(StorageType.PERIODICALS, periodicals);
	}
	public static void saveToStorage(StorageType type, Object ob) {
		ObjectOutputStream out = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(ob);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(Exception e) {}
			}
		}
	}
	
	public static Object readFromStorage(StorageType type) {
		ObjectInputStream in = null;
		Object retVal = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			retVal = in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch(Exception e) {}
			}
		}
		return retVal;
	}
	
	
	
	final static class Pair<S,T> implements Serializable{
		
		S first;
		T second;
		Pair(S s, T t) {
			first = s;
			second = t;
		}
		@Override 
		public boolean equals(Object ob) {
			if(ob == null) return false;
			if(this == ob) return true;
			if(ob.getClass() != getClass()) return false;
			@SuppressWarnings("unchecked")
			Pair<S,T> p = (Pair<S,T>)ob;
			return p.first.equals(first) && p.second.equals(second);
		}
		
		@Override 
		public int hashCode() {
			return first.hashCode() + 5 * second.hashCode();
		}
		@Override
		public String toString() {
			return "(" + first.toString() + ", " + second.toString() + ")";
		}
		private static final long serialVersionUID = 5399827794066637059L;
	}
	
}
