package project2.business;

import java.util.List;

import project.dataaccess.DataAccess;
import project.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void addNewMember(String memberId, String firstName, String lastName,
			String telNumber, Address addr) throws LibrarySystemException;
	public LibraryMember search(String memberId);
	public void updateMemberInfo(String memberId, String firstName, String lastName,
			String telNumber, Address addr) throws LibrarySystemException;
	public void checkoutBook(String memberId, String isbn) throws LibrarySystemException;
	public void checkoutPeriodical(String memberId, String title, int issueNum) throws LibrarySystemException;
	public boolean addBook(String isbn, String title, int maxCheckoutLength, List<Author> authors)
		throws LibrarySystemException;
	public boolean addPeriodical(int issueNumber, String title, int maxCheckoutLength)
		throws LibrarySystemException;
	public boolean addBookCopy(String isbn) throws LibrarySystemException;
	public boolean addPeriodicalCopy(String title, int issueNum) throws LibrarySystemException;
	public void printCheckoutRecord(String memberId) throws LibrarySystemException;
	public CopyStatus computeStatus(LendableCopy copy);
	public Book searchBook(String isbn);
	public Periodical searchPeriodical(String title, int issueNum);
	public List<String> allMemberIds();
	public List<String> allBookIds();
}
