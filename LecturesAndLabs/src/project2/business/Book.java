package project2.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Immutable (almost)
 * One question regarding immutability is whether a mutable
 * value is ever returned -- in particular, whether getNextAvailableCopy
 * returns a mutable object (of type BookCopy). But (see class comments
 * on BookCopy), BookCopy is immutable.
 * 
 * The other issue is that, to change availability of a BookCopy
 * we have to change the copy flag, but also change the instance of
 * BookCopy that in the BookCopy[] array inside the Book. We have
 * just provided an update method to do this (updateBookCopyArray(BookCopy copy) )
 *
 */
final public class Book implements LendableItem, Cloneable {
	
	private static final long serialVersionUID = 6110690276685962829L;
	private BookCopy[] copies;
	private List<Author> authors;
	private String isbn;
	private String title;
	private int maxCheckoutLength;
	public Book(String isbn, String title, int maxCheckoutLength, List<Author> authors) {
		this.isbn = isbn;
		this.title = title;
		this.maxCheckoutLength = maxCheckoutLength;
		this.authors = Collections.unmodifiableList(authors);
		copies = new BookCopy[]{new BookCopy(this, 1, true)};
		
	}

	public void updateBookCopyArray(BookCopy copy) {
		for(int i = 0; i < copies.length; ++i) {
			if(copies[i].getCopyNum() == copy.getCopyNum()) {
				copies[i] = copy;
				break;
			}
		}
	}
	public List<Integer> getCopyNums() {
		List<Integer> retVal = new ArrayList<>();
		for(BookCopy c : copies) {
			retVal.add(c.getCopyNum());
		}
		return retVal;
		
	}
	
	public void addCopy() {
		BookCopy[] newArr = new BookCopy[copies.length + 1];
		System.arraycopy(copies, 0, newArr, 0, copies.length);
		newArr[copies.length] = new BookCopy(this, copies.length +1, true);
		copies = newArr;
	}
	
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Book b = (Book)ob;
		return b.isbn.equals(isbn);
	}
	
	@Override
	public Book clone() {
		Book retval = null;
		try {
			retval = (Book)super.clone();
			BookCopy[] newCopies = new BookCopy[copies.length];
			for(int i = 0; i < copies.length; ++i) {
				newCopies[i] = new BookCopy(
						new Book(isbn, title, maxCheckoutLength, authors),
						copies[i].getCopyNum(),
						copies[i].isAvailable());
				
			}
			for(int i = 0; i < copies.length; ++i) {
				((Book)newCopies[i].getLendableItem()).copies = newCopies;
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
		return "isbn: " + isbn + ", maxLength: " + maxCheckoutLength + ", available: " + isAvailable();
	}
	@Override
	public int getNumCopies() {
		return copies.length;
	}
	@Override
	public String getTitle() {
		return title;
	}
	
	/** Return value is an unmodifiable List, to ensure that Book is immutable */
	public List<Author> getAuthors() {
		return authors;
	}
	
	public String getIsbn() {
		return isbn;
	}
	@Override
	public LendableCopy getNextAvailableCopy() {	
		Optional<BookCopy> optional 
			= Arrays.stream(copies)
			        .filter(x -> x.isAvailable()).findFirst();
		return optional.isPresent() ? optional.get() : null;
	}
	@Override
	public LendableCopy getCopy(int copyNum) {
		for(BookCopy c : copies) {
			if(copyNum == c.getCopyNum()) {
				return c;
			}
		}
		return null;
	}
	@Override
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	
	
	
}
