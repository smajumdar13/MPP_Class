package project2.business;

/**
 * Immutable class
 * The only question about immutability is whether it ever
 * returns a mutable value -- in particular, whether <code>book</code>
 * is mutable. The only mutable variable in Book is the
 * BookCopy array, but there is no getter for this array. Book
 * is therefore immutable (see Book class comments), and os
 * BookCopy is also immutable.
 *
 */
final public class BookCopy implements LendableCopy, Cloneable {
	
	private static final long serialVersionUID = -63976228084869815L;
	private Book book;
	private int copyNum;
	private boolean isAvailable;
	BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	
	BookCopy(Book book, int copyNum) {
		this.book = book;
		this.copyNum = copyNum;
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
		return book;
	}
	@Override
	public LendableCopy changeAvailability() {
		BookCopy copy = clone();
		copy.isAvailable = !isAvailable;
		((Book)copy.getLendableItem()).updateBookCopyArray(copy);
		return copy;
	}
	@Override
	public BookCopy clone() {
		BookCopy retval;
		try {
			retval = (BookCopy)super.clone();
			Book b = (Book)retval.getLendableItem();
			retval.book = b.clone();
			
		} catch(CloneNotSupportedException e) {
			throw new IllegalStateException("Unable to clone BookCopy");
		}
		return retval;
	}

}
