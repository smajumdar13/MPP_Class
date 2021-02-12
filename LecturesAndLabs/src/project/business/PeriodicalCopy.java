package project.business;

/**
 * Immutable class
 * The only question about immutability is whether it ever
 * returns a mutable value -- in particular, whether <code>periodical</code>
 * is mutable. The only mutable variable in Periodical is the
 * PeriodicalCopy array, but there is no getter for this array. Periodical
 * is therefore immutable (see Periodical class comments), and so
 * PeriodicalCopy is also immutable.
 *
 */
public class PeriodicalCopy implements LendableCopy {
	
	private static final long serialVersionUID = 4615082456009546400L;
	private Periodical periodical;
	private int copyNum;
	private boolean isAvailable;
	public PeriodicalCopy(Periodical periodical, int copyNum, boolean isAvailable) {
		this.periodical = periodical;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	@Override
	public boolean isAvailable() {
		return isAvailable;
	}

	@Override
	public int getCopyNum() {
		return copyNum;
	}
	@Override
	public LendableItem getLendableItem() {
		return periodical;
	}
	@Override
	public LendableCopy changeAvailability() {
		PeriodicalCopy copy = clone();
		copy.isAvailable = !isAvailable;
		periodical.updatePeriodicalCopyArray(copy);
		return copy;
	}
	@Override
	public PeriodicalCopy clone() {
		PeriodicalCopy retval;
		try {
			retval = (PeriodicalCopy)super.clone();
			Periodical p = (Periodical)retval.getLendableItem();
			retval.periodical = p.clone();
			
		} catch(CloneNotSupportedException e) {
			throw new IllegalStateException("Unable to clone BookCopy");
		}
		return retval;
	}
	
}
