package Lesson5.prob1.rulesets;

import java.awt.Component;
import Lesson5.prob1.gui.CDWindow;

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
		cdWin = (CDWindow) ob;
		nonEmptyRule();
		floatingPointPrice();
		priceGreaterThan();
	}
	
	private void nonEmptyRule() throws RuleException{
		if(cdWin.getArtistValue().trim().isEmpty() || cdWin.getTitle().trim().isEmpty() || cdWin.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}
	}
	
	private void floatingPointPrice() throws RuleException{
		String message = "Price must be a floating point with two decimal places";
		String value = cdWin.getPriceValue().trim();
		int decimal = value.indexOf(".");
		if(decimal<0) {
			throw new RuleException(message);		
		}
		if((value.length() - decimal - 1) <2) {
			throw new RuleException(message);		
		}
	}
	
	private void priceGreaterThan() throws RuleException{
		String value = cdWin.getPriceValue().trim();
		Float fl = Float.parseFloat(value);
		if(fl<0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
	
}
