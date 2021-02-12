package project.business;

import java.io.Serializable;
import java.time.LocalDate;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
	private CheckoutRecord record = new CheckoutRecord();
	public LibraryMember(String memberId, String fname, String lname, String tel,Address add) {
		super(fname,lname, tel, add);
		this.memberId = memberId;		
	}
	
	//usual way of adding info to the record
	public void checkout(LendableCopy copy, LocalDate checkoutDate, LocalDate dueDate) {
		copy = copy.changeAvailability();
		CheckoutRecordEntry entry = CheckoutRecordEntry.createEntry(copy, checkoutDate, dueDate);
		record = record.addEntry(entry);	
	}
	//not the usual way of adding info to the record -- no save to data storage
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		record = record.addEntry(entry);
	}
	
	public String getMemberId() {
		return memberId;
	}

	public CheckoutRecord getRecord() {
		return record;
	}
	
	public String formattedCheckoutRecord() {
		StringBuilder sb = new StringBuilder();
		for(CheckoutRecordEntry e : record.getCheckoutRecordEntries()) {
			sb.append(e.toString() + "\n");
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + 
				", " + getTelephone() + " " + getAddress();
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
