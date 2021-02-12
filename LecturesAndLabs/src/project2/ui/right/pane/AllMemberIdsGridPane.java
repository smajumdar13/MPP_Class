package project2.ui.right.pane;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import project2.business.ControllerInterface;
import project2.business.SystemController;
import java.util.*;
public class AllMemberIdsGridPane extends GeneralGridPane {
	public  AllMemberIdsGridPane() {
		build();

	}
	@Override
	public void buildDetails() {
		Label all = new Label("All Member IDs");
		all.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(all, 0, 0);
		TextArea ta = new TextArea();
		ControllerInterface ci = new SystemController();
		List<String> ids = ci.allMemberIds();
		System.out.println(ids);
		StringBuilder sb = new StringBuilder();
		for(String s: ids) {
			sb.append(s + "\n");
		}
		ta.setText(sb.toString());
		add(ta, 0,1);
	}

	@Override
	public void addListeners() {
		//do nothing
		
	}

	@Override
	public void additionalProcessing() {
		// do nothing
		
	}

}
