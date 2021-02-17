package Lesson5.prob1.rulesets;

import java.awt.Component;
import Lesson5.prob1.gui.BookWindow;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWin;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWin = (BookWindow) ob;
		nonEmptyRule();
		numericIsbn();
		isbnFormat();
		floatingPointPrice();
		priceGreaterThan();
	}

	private void nonEmptyRule() throws RuleException{
		if(bookWin.getIsbnValue().trim().isEmpty() || bookWin.getPriceValue().trim().isEmpty() || bookWin.getTitle().trim().isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}
	}
	
	private void numericIsbn() throws RuleException {
		String num = bookWin.getIsbnValue().trim();
		try {
				Long.parseLong(num);
		} catch (NumberFormatException e) {
			throw new RuleException("ISBN must be numeric.");
		}
	}
	
	private void isbnFormat() throws RuleException {
		String isbn = bookWin.getIsbnValue().trim();
		if(!(isbn.length()==10 || isbn.length()==13)) {
			throw new RuleException("ISBN should consist 10 or 13 characters");
		}
		if(isbn.length()==10) {
			int first = Integer.parseInt(isbn.substring(0,1));
			if(!(first==0 || first==1)) {
				throw new RuleException("First digit must be 0 or 1");
			}
		}
		if(isbn.length()==13) {
			int first = Integer.parseInt(isbn.substring(0,3));
			if(!(first==978 || first==979)) {
				throw new RuleException("First 3 digits must be 978 or 979");
			}
		}
	}
	
	private void floatingPointPrice() throws RuleException{
		String message = "Price must be a floating point with two decimal places";
		String value = bookWin.getPriceValue().trim();
		int decimal = value.indexOf('.');
		if(decimal<0) {
			throw new RuleException(message);		
		}
		if((value.length() - decimal-1) < 2) {
			throw new RuleException(message);		
		}
	}
	
	private void priceGreaterThan() throws RuleException{
		String value = bookWin.getPriceValue().trim();
		Float fl = Float.parseFloat(value);
		if(fl<0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
}
