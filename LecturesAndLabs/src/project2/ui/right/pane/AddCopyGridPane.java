package project2.ui.right.pane;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class AddCopyGridPane extends GeneralGridPane{


	TextField isbn = new TextField();	
	
	TextField issueNumber = new TextField();
	TextField titleForPeriodical = new TextField();
	
	Button addButton;
	
	Text actiontarget;
	
	public  AddCopyGridPane() {
		build();

	}

	@Override
	public void buildDetails() {
		Label book = new Label("Book");
		book.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(book, 0, 0);
		
		add(new Label("ISBN: "), 0, 1);
		add(isbn, 1, 1);

		Label periodical = new Label("Periodical");
		periodical.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(periodical, 0, 5);
		
		add(new Label("Issue Number: "), 0, 6);
		add(issueNumber, 1, 6);
		
		add(new Label("Title: "), 0, 7);
		add(titleForPeriodical, 1, 7);
		
		addButton = new Button("Add");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(addButton);
		add(hbBtn, 1, 8);	
		
		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,10));
		add(actiontarget, 1, 9);
	}

	@Override
	public void addListeners() {
		addButton.setOnAction(evt -> {

				try {
					if(isbn.getText() != null && isbn.getText().trim() != "")
						getSystemController().addBookCopy(isbn.getText());
					else
						getSystemController().addPeriodicalCopy(titleForPeriodical.getText(), Integer.valueOf(issueNumber.getText()));
					actiontarget.setText("Add copy successfully!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});		
	}

	@Override
	public void additionalProcessing() {
		// TODO Auto-generated method stub
		
	}
	


}
