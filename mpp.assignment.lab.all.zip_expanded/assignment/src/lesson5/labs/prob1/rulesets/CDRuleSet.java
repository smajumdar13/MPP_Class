package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;



/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cdWin = (CDWindow)ob;
		nonemptyRule();
		priceFloatingPointRule();
		priceGreaterThanRule();
	}
	private void nonemptyRule() throws RuleException {
		if (cdWin.getArtistValue().trim().isEmpty() || cdWin.getTitle().trim().isEmpty()
				|| cdWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

	}
	private void priceGreaterThanRule() throws RuleException {
		String val = cdWin.getPriceValue().trim();
		String message = " Price must be a number greater than 0.49";
		Float num = Float.parseFloat(val);
		if (num < 0.49)
			throw new RuleException(message);

	}

	private void priceFloatingPointRule() throws RuleException {
		String val = cdWin.getPriceValue().trim();
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
	
}
