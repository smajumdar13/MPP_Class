package old.lesson5.lecture.factorymethods2;

import java.awt.Component;

import old.lesson5.lecture.factorymethods2.rulesets.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
