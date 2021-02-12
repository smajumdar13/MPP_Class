package project2.business;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

import project2.dataaccess.DataAccess;
import project2.dataaccess.DataAccessFacade;
import project2.dataaccess.TestData;

public class SystemController implements ControllerInterface {
	
	/**
	 * This method checks if memberId already exists -- if so, it cannot be
	 * added as a new member, and an exception is thrown.
	 * If new, creates a new LibraryMember based on input data and uses DataAccess to store it.
	 * If membe
	 */
	public void addNewMember(String memberId, String firstName, String lastName,
			String telNumber, Address addr) throws LibrarySystemException {
		LibraryMember mem = search(memberId);
		if(mem != null) {
			throw new LibrarySystemException("A library member with memberId = " + memberId + " already exists!"); 
		}
		mem  = new LibraryMember(memberId, firstName, lastName, telNumber, addr);
		DataAccess da = new DataAccessFacade();
		da.saveNewMember(mem);
	}
	
	/**
	 * Reads data store for a library member with specified id.
	 * Ids begin at 1001...
	 * Returns a LibraryMember if found, null otherwise
	 * 
	 */
	public LibraryMember search(String memberId) {
		DataAccess da = new DataAccessFacade();
		return da.searchMember(memberId);
	}
	
	/**
	 * Same as creating a new member (because of how data is stored)
	 */
	public void updateMemberInfo(String memberId, String firstName, String lastName,
			String telNumber, Address addr) throws LibrarySystemException {
		LibraryMember mem = search(memberId);
		if(mem == null) {
			throw new LibrarySystemException("No library member with memberId = " + memberId + " found!"); 
		}
		mem = new LibraryMember(memberId, firstName, lastName, telNumber, addr);
		DataAccess da = new DataAccessFacade();
		da.saveNewMember(mem);
	}
	
	/**
	 * Looks up Book by isbn from data store. If not found, an exception is thrown.
	 * If no copies are available for checkout, an exception is thrown.
	 * If found and a copy is available, member's checkout record is
	 * updated and copy of this publication is set to "not available"
	 */
	public void checkoutBook(String memberId, String isbn) throws LibrarySystemException {
		LibraryMember mem = search(memberId);
		if(mem == null) throw new LibrarySystemException("Library member with ID " + memberId + " not found!");
		Book book = searchBook(isbn);
		if(book == null || !book.isAvailable()) throw new LibrarySystemException("Book with ISBN = " + isbn + " is not available for checkout!");
		
		LendableCopy nextAvailableCopy = book.getNextAvailableCopy();
		if(nextAvailableCopy == null) 
			throw new IllegalStateException("Book tests as 'true' for isAvailable, but cannot find available copy.");
		mem.checkout(nextAvailableCopy, 
				LocalDate.now(), 
				LocalDate.now().plus(book.getMaxCheckoutLength(), ChronoUnit.DAYS));
		DataAccess da = new DataAccessFacade();
		da.saveNewMember(mem);
	}
	@Override
	public Book searchBook(String isbn) {
		DataAccess da = new DataAccessFacade();
		return da.searchBook(isbn);
	}
	@Override
	public Periodical searchPeriodical(String title, int issueNum) {
		DataAccess da = new DataAccessFacade();
		return da.searchPeriodical(title, issueNum);
	}
	
	@Override
	public List<String> allMemberIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readMemberMap().keySet());
		return retval;
	}
	
	@Override
	public List<String> allBookIds() {
		DataAccess da = new DataAccessFacade();
		List<String> retval = new ArrayList<>();
		retval.addAll(da.readBooksMap().keySet());
		return retval;
	}
	
	/**
	 * Looks up Periodical by title and issue number, from data store. 
	 * If not found, return value is false.
	 * If no copies are available for checkout, returns false.
	 * If found and a copy is available, member's checkout record is
	 * updated and copy of this publication is set to "not available"
	 */
	@Override
	public void checkoutPeriodical(String memberId, String title, int issueNum)
			throws LibrarySystemException {
		LibraryMember mem = search(memberId);
		if(mem == null) throw new LibrarySystemException("Library member with ID " + memberId + " not found!");
		Periodical periodical = searchPeriodical(title, issueNum);
		if(periodical == null || !periodical.isAvailable()) throw new LibrarySystemException("Periodical = " + title + ", issue number " + issueNum 
				+ " is not available for checkout!");
		
		mem.checkout(periodical.getNextAvailableCopy(), 
				LocalDate.now(), 
				LocalDate.now().plus(periodical.getMaxCheckoutLength(), ChronoUnit.DAYS));
		DataAccess da = new DataAccessFacade();
		da.saveNewMember(mem);	}
	
	/**
	 * Looks up book by isbn to see if it exists, throw exceptioni.
	 * Else add the book to storage
	 */
	public boolean addBook(String isbn, String title, int maxCheckoutLength, List<Author> authors) 
			throws LibrarySystemException {
		Book test = searchBook(isbn);
		if(test != null) throw new LibrarySystemException("Book with isbn " + isbn 
			+ " is already in the library collection!");
		DataAccess da = new DataAccessFacade();
		da.saveNewBook(new Book(isbn, title, maxCheckoutLength, authors));
		return true;
	}
	public boolean addPeriodical(int issueNumber, String title, int maxCheckoutLength) 
			throws LibrarySystemException{
		Periodical test = searchPeriodical(title, issueNumber);
		if(test != null) throw new LibrarySystemException("Periodical " + title 
			+ ", issue number " + issueNumber + ", is already in the library collection!");
		DataAccess da = new DataAccessFacade();
		da.saveNewPeriodical(new Periodical(issueNumber, title, maxCheckoutLength));
		return true;
	}
	public boolean addBookCopy(String isbn) throws LibrarySystemException {
		Book book = searchBook(isbn);
		if(book == null) throw new LibrarySystemException("No book with isbn " + isbn 
			+ " is in the library collection!");
		book.addCopy();
		return true;
	}
	/** Returns the copyNums of the copies of this book */
	public List<Integer> getCopyNumbers(Book b) {
		return b.getCopyNums();
	}
	public List<Integer> getCopyNumbers(Periodical p) {
		return p.getCopyNums();
	}
	public boolean addPeriodicalCopy(String title, int issueNum) 
			throws LibrarySystemException {
		Periodical p = searchPeriodical(title, issueNum);
		if(p == null) throw new LibrarySystemException("No periodical entitled "
				+ title + ", issue number " + issueNum  
				+ " is in the library collection!");
		p.addCopy();
		return true;
	}
	public void printCheckoutRecord(String memberId) throws LibrarySystemException {
		LibraryMember mem = search(memberId);
		if(mem == null) throw new LibrarySystemException("Library member with ID " + memberId + " not found!");
		System.out.println(mem.formattedCheckoutRecord());
	}
	/**
	 * Returns a CopyStatus which tells whether the copy
	 * is overdue and who the borrower is.
	 */
	public CopyStatus computeStatus(LendableCopy copy) {
		DataAccess dataAccess = new DataAccessFacade();
		LendableItem item = copy.getLendableItem();
		List<LibraryMember> membersFound = dataAccess.readMemberMap().values()
				         .stream()			      
				         .filter(member ->  
				            {   //returns all members with a checkout record having an entry
				            	//containing a copy that matches input copy
				            	return member.getRecord().getCheckoutRecordEntries()
				            	      .stream()
				            	      .filter(e -> 			                   
				            	            e.getCopy().getLendableItem().equals(item))
				            	      .findAny()
				            	      .isPresent();
				            })
				          .collect(Collectors.toList());
		CopyStatus status = null;
		
		if(!membersFound.isEmpty()) {
			LibraryMember borrower = membersFound.get(0);
			CheckoutRecord record = borrower.getRecord();
			//returns true if the checkout record entry for this copy indicates the item is overdue
			boolean isOverdue = record.getCheckoutRecordEntries().stream()
					                  .filter(e -> e.getCopy().getLendableItem().equals(item) 
					                		  && e.isOverdue())
					                  .findAny().isPresent();
		
			status = new CopyStatus(copy, borrower, isOverdue);
		} else {
			//no borrower was found
			status = new CopyStatus(copy, null, false);
		}
				    
		return status;
		
	}
	public static void main(String[] args) throws LibrarySystemException {
		SystemController controller = new SystemController();
		DataAccess da = new DataAccessFacade();
		//test addMember
//		try {
//			controller.addNewMember("1011", "Test First", "Test Last",
//				"555-555-5555", new Address("11 Test", "TestVille", "IA", "52556"));
//		} catch(LibrarySystemException e) {
//			e.printStackTrace();
//		}
//		LibraryMember member = da.searchMember("1011");
//		System.out.println("Added member " + member + "\n");
		
		//test computeStatus
		Book b = new Book("28-12388", "The Big Horse", 
				21, Arrays.asList((new TestData()).allAuthors.get(0), 
						(new TestData()).allAuthors.get(1)));
		da.saveNewBook(b);
		LendableCopy c = b.getNextAvailableCopy();
		int num = c.getCopyNum();
		controller.checkoutBook("1001", "28-12388");
		System.out.println("Copy available? " + c.isAvailable());
		b = da.searchBook("28-12388");
		c = b.getCopy(num);
		System.out.println(controller.computeStatus(c));
		//System.out.println(controller.computeStatus(c));
		//LendableCopy copy = new BookCopy(b, 23);
		//System.out.println(controller.computeStatus(copy));
		
	}

	

	
}
