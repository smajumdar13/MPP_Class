package project.business;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

import projectstartup.librarysample.dataaccess.DataAccessFacade;

/* Immutable */
final public class CheckoutRecordEntry implements Serializable, Cloneable {
	private static final Logger LOG = Logger.getLogger(CheckoutRecordEntry.class.getName());
	private static final long serialVersionUID = -5407996078345151128L;
	private LendableCopy copy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	//this field is necessary in order to detect which items are overdue
	private boolean hasBeenReturned = false;
	public CheckoutRecordEntry(LendableCopy copy, LocalDate checkoutDate, LocalDate dueDate) { 
		this.copy = copy;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}
	public static CheckoutRecordEntry createEntry(LendableCopy copy,
			LocalDate checkoutDate, LocalDate dueDate) {
		return new CheckoutRecordEntry(copy, checkoutDate, dueDate);
	}
	public LendableCopy getCopy() {
		return copy;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	/** convenience method that determines if this copy is overdue */
	public boolean isOverdue() {
		if(hasBeenReturned) return false;
		if(dueDate.isBefore(LocalDate.now())) return true;
		return false;
	}
	
	/** Allows member to return the copy of the publication that was checked out
	 *  Updates the hasBeenReturned flag in this class, and returns a new
	 *  CheckoutRecordEntry with this updated value
	 * @return
	 */
	public CheckoutRecordEntry returnCopy() {
		if(hasBeenReturned) {
			LOG.warning("Attempt to return a book that was already returned");
			return this;
		}
		CheckoutRecordEntry retval = clone();
		retval.hasBeenReturned = true;
		return retval;
		
	}
	@Override
	public CheckoutRecordEntry clone() {
		CheckoutRecordEntry retval = null;
		try {
			retval = (CheckoutRecordEntry)super.clone();
		} catch(CloneNotSupportedException e) {
			throw new IllegalStateException("Cannot clone CheckoutRecordEntry");
		}
		return retval;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		CheckoutRecordEntry e = (CheckoutRecordEntry)ob;
		return checkoutDate.equals(e.checkoutDate)
				&& dueDate.equals(e.dueDate)
				&& copy.getLendableItem().equals(e.copy.getLendableItem())
				&& copy.getCopyNum() == e.copy.getCopyNum();
	}
	@Override
	public String toString() {
		return "[" + "checkoutdate:" + 
	        checkoutDate.format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN)) +
	        ", dueDate: " + dueDate.format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN)) +
	        ", publication: " + copy + "]";
	}
}
