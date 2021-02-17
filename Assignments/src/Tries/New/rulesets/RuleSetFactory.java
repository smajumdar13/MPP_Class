package Tries.New.rulesets;

import java.awt.Component;
import java.util.HashMap;

import Tries.New.gui.BookWindow;
import Tries.New.gui.CDWindow;

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
			throw new IllegalArgumentException("No Ruleset found for this Component");
			
		}
		return map.get(c1);
	}
	
}
