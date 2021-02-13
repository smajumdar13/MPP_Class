package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.BookWindow;


/**
 * Rules: 1. All fields must be nonempty 2. Isbn must be numeric and consist of
 * either 10 or 13 characters 3. If Isbn has length 10, the first digit must be
 * 0 or 1 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 6. Price
 * must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWin;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bookWin = (BookWindow)ob;
		nonemptyRule();
		//idNumericRule();
		isIsbnLengthRule();
		isIsbn10DigitRule();
		isIsbn13DigitRule();
		priceFloatingPointRule();
		priceGreaterThanRule();
	}

	private void priceGreaterThanRule() throws RuleException {
		String val = bookWin.getPriceValue().trim();
		String message = " Price must be a number greater than 0.49";
		Float num = Float.parseFloat(val);
		if (num < 0.49)
			throw new RuleException(message);

	}

	private void priceFloatingPointRule() throws RuleException {
		String val = bookWin.getPriceValue().trim();
		String message = "Price must be a floating point number with two decimal places.";
		try {
			Float.parseFloat(val);

		} catch (NumberFormatException e) {
			throw new RuleException(message);
		}
		int decimalPos = val.indexOf('.');
		if (decimalPos < 0)
			throw new RuleException(message);
		int decimalPlaces = val.length() - decimalPos - 1;

		if (decimalPlaces != 2)
			throw new RuleException(message);

	}

	private void isIsbnLengthRule() throws RuleException {
		if (!(bookWin.getIsbnValue().length() == 10 || bookWin.getIsbnValue().length() == 13)) {
			throw new RuleException(" Isbn must consist of either 10 or 13 characters");
		}

	}

	private void isIsbn10DigitRule() throws RuleException {
		String val = bookWin.getIsbnValue().trim();
		int firstDigit = Integer.parseInt(val.substring(0, 1));
		if (bookWin.getIsbnValue().length() == 10 && !(firstDigit == 0 || firstDigit == 1)) {
			throw new RuleException("The first digit must be 0 or 1");
		}

	}

	private void isIsbn13DigitRule() throws RuleException {
		String val = bookWin.getIsbnValue().trim();
		int firstDigit = Integer.parseInt(val.substring(0, 3));
		if (bookWin.getIsbnValue().length() == 13 && !(firstDigit == 978 || firstDigit == 979)) {
			throw new RuleException("The first three digit must be 978 or 979");
		}

	}

	private void nonemptyRule() throws RuleException {
		if (bookWin.getIsbnValue().trim().isEmpty() || bookWin.getTitle().trim().isEmpty()
				|| bookWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

	}

	private void idNumericRule() throws RuleException {
		String val = bookWin.getIsbnValue().trim();
		try {
			Integer.parseInt(val);
			// val is numeric
		} catch (NumberFormatException e) {
			throw new RuleException("Isbn must be numeric");
		}
	}

}
