package Lesson5.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import Lesson5.prob1.gui.BookWindow;
import Lesson5.prob1.gui.CDWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
				map.put(BookWindow.class, new BookRuleSet());
				map.put(CDWindow.class, new CDRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> c1 = c.getClass();
		if(!map.containsKey(c1)) {
			throw new IllegalArgumentException("RuleSet absent!");
		}
		return map.get(c1);
	}
}
