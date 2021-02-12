package project2.dataaccess;

import java.util.HashMap;

import project2.business.Book;
import project2.business.LibraryMember;
import project2.business.Periodical;
import project2.dataaccess.DataAccessFacade.Pair;
import project2.dataaccess.DataAccessFacade.StorageType;



public interface DataAccess {
	public LibraryMember searchMember(String memberId);
	public Book searchBook(String isbn);
	public Periodical searchPeriodical(String title, int issueNum);
	
	
	///////save methods
	public void saveNewMember(LibraryMember member);
	public void updateMember(LibraryMember member);
	
	//save new lendable item
	public void saveNewBook(Book book);
	public void saveNewPeriodical(Periodical periodical);
	
	//////read methods 
	public HashMap<String,Book> readBooksMap();
	public HashMap<Pair<String,Integer>, Periodical> readPeriodicalsMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
