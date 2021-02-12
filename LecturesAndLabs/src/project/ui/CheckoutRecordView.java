package project.ui;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.business.Book;
import project.business.CheckoutRecordEntry;
import project.business.LendableItem;
import project.business.LibraryMember;
import project.business.Periodical;
import projectstartup.librarysample.dataaccess.DataAccessFacade;

public class CheckoutRecordView {
	private static final String BOOK = "Book";
	private static final String PERIODICAL = "Periodical";
	public static class CheckoutRecordEntryView {
		String index;
		public String getIndex() {
			return index;
		}
		String checkoutDate;
		public String getCheckoutDate() {
			return checkoutDate;
		}
		String dueDate;
		public String getDueDate() {
			return dueDate;
		}
		String pubType;
		public String getPubType() {
			return pubType;
		}
		String title;
		public String getTitle() {
			return title;
		}
		String isbnIssueNum;
		public String getIsbnIssueNum() {
			return isbnIssueNum;
		}
		
		String copyNum;
		public String getCopyNum() {
			return copyNum;
		}
	}
	private List<CheckoutRecordEntry> entries;
	private Map<CheckoutRecordEntry, Integer> indexMap = new HashMap<>();
	public CheckoutRecordView(LibraryMember member) {
		this.entries = member.getRecord().getCheckoutRecordEntries();
		for(int i = 0; i < entries.size(); ++i) {
			indexMap.put(entries.get(i), i+1);
		}
	}
	public List<CheckoutRecordEntryView> getEntryViews() {
		
		List<CheckoutRecordEntryView> retval = new ArrayList<>();
		entries.forEach(e -> {
			CheckoutRecordEntryView view = null;
			view = new CheckoutRecordEntryView();
			view.index = indexMap.get(e).toString();
			view.checkoutDate = e.getCheckoutDate().format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN));
			view.dueDate = e.getDueDate().format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN)); 
			view.pubType = (e.getCopy().getLendableItem() instanceof Book) ? BOOK : PERIODICAL;
			view.title = e.getCopy().getLendableItem().getTitle();
			view.isbnIssueNum = getIsbnIssueNum(e);
			view.copyNum = (new Integer(e.getCopy().getCopyNum())).toString();
			retval.add(view);			         
		});
		return retval;
	}
	
	private String getIsbnIssueNum(CheckoutRecordEntry e) {
		LendableItem item = e.getCopy().getLendableItem();
		if(item instanceof Book) {
			return ((Book)item).getIsbn();
		} else if(item instanceof Periodical) {
			return (new Integer(((Periodical)item).getIssueNumber()).toString());
		} else {
			return "";
		}
	}
	
	
	
	
	 
}
