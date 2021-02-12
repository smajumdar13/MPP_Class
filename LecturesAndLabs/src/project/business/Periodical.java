package project.business;

import java.util.Arrays;
import java.util.Optional;

/**
 * Immutable
 * The only question regarding immutability is whether a mutable
 * value is ever returned -- in particular, whether getNextAvailableCopy
 * returns a mutable object (of type PeriodicalCopy). But (see class comments
 * on PeriodicalCopy), PeriodicalCopy is immutable.
 *
 */
public class Periodical implements LendableItem, Cloneable {
	
	private static final long serialVersionUID = -166893515732743090L;
	private PeriodicalCopy[] copies;
	private String title;
	private int issueNumber;
	private int maxCheckoutLength;
	public Periodical(int issueNumber, String title, int maxCheckoutLength) {
		this.issueNumber = issueNumber;
		this.title = title;
		copies = new PeriodicalCopy[]{new PeriodicalCopy(this, 1, true)};
	}
	@Override
	public void addCopy() {
		PeriodicalCopy[] newArr = new PeriodicalCopy[copies.length + 1];
		System.arraycopy(copies, 0, newArr, 0, copies.length);
		newArr[copies.length] = new PeriodicalCopy(this, copies.length +1, true);
		copies = newArr;
	}
	public void updatePeriodicalCopyArray(PeriodicalCopy copy) {
		for(int i = 0; i < copies.length; ++i) {
			if(copies[i].getCopyNum() == copy.getCopyNum()) {
				copies[i] = copy;
				break;
			}
		}
	}
	@Override
	public Periodical clone() {
		Periodical retval = null;
		try {
			retval = (Periodical)super.clone();
			PeriodicalCopy[] newCopies = new PeriodicalCopy[copies.length];
			for(int i = 0; i < copies.length; ++i) {
				newCopies[i] = new PeriodicalCopy(
						new Periodical(issueNumber,title,maxCheckoutLength),
						copies[i].getCopyNum(),
						copies[i].isAvailable());
				
			}
			for(int i = 0; i < copies.length; ++i) {
				((Periodical)newCopies[i].getLendableItem()).copies = newCopies;
			}
			retval.copies = newCopies;
		} catch(CloneNotSupportedException e) {
			throw new IllegalStateException("Cannot clone Book");
		}
		return retval;
	}
	public boolean isAvailable() {
		if(copies == null) {
			return false;
		}
		return Arrays.stream(copies)
				     .map(l -> l.isAvailable())
				     .reduce(false, (x,y) -> x || y);
	}
	@Override
	public String toString() {
		return "title: " + title + ", issueNum: " + issueNumber + ", available: " + isAvailable();
	}
	@Override
	public int getNumCopies() {
		return copies.length;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public LendableCopy getNextAvailableCopy() {	
		Optional<PeriodicalCopy> optional 
			= Arrays.stream(copies)
			        .filter(x -> x.isAvailable()).findFirst();
		return optional.isPresent() ? optional.get() : null;
	}
	@Override
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	public int getIssueNumber() {
		return issueNumber;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Periodical p = (Periodical) ob;
		return p.title.equals(title) && p.issueNumber == issueNumber;
	}
	
	
	
}
