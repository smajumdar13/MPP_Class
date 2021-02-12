package project2.business;

import java.io.Serializable;

/**
 * Provides checkout data about a copy
 * This class is immutable
 *
 */
final public class CopyStatus implements Serializable {
	
	private static final long serialVersionUID = -3965370265074806525L;
	private LendableCopy copy;
	private LibraryMember borrowingMember;
	private boolean isOverdue = false;
	
	public CopyStatus(LendableCopy copy, LibraryMember mem, boolean isOverdue) {
		this.copy = copy;
		this.borrowingMember = mem;
		this.isOverdue = isOverdue;
	}

	public LendableCopy getCopy() {
		return copy;
	}
	
	public boolean isCheckedOut() {
		return !copy.isAvailable();
	}

	public LibraryMember getBorrowingMember() {
		return borrowingMember;
	}

	public boolean isOverdue() {
		return isOverdue;
	}
	
	public String toString(){
		if (isCheckedOut())		
			return "The copy is checked out by: " + borrowingMember.toString() + "\n"
				+ (isOverdue() ? "The copy is overdue." : "The copy is not overdue.");
		else
			return "The copy is available";
			
	}
}
