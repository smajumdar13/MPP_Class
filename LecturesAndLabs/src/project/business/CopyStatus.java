package project.business;

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
	//if true, borrowingMember must be false;
	public boolean isCheckedOut() {
		return copy.isAvailable();
	}

	public LibraryMember getBorrowingMember() {
		return borrowingMember;
	}

	public boolean isOverdue() {
		return isOverdue;
	}
	@Override
	public String toString() {
		return "Status: " + copy.getCopyNum() + ": " + copy.getLendableItem() + ", " 
				+ "member id: " + borrowingMember.getMemberId() + " is overdue? " + isOverdue;
	}
}
