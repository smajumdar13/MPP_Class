package project2.ui.right.pane;

import project2.business.LibrarySystemException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CheckOutGridPane extends GeneralGridPane{

	TextField ID = new TextField();
	TextField ISBN = new TextField();
	
	TextField title = new TextField();
	TextField issNum = new TextField();
	Button checkOutButton;
	Text actiontarget;
	
	public CheckOutGridPane() {
		build();
	
	}

	@Override
	public void buildDetails() {
		add(new Label("ID: "), 0, 1);
		add(ID, 1, 1);

		add(new Label("ISBN: "), 0, 2);
		add(ISBN, 1, 2);
		
		add(new Label("OR"), 0, 3);

		add(new Label("Title: "), 0, 4);
		add(title, 1, 4);

		add(new Label("Issue Number: "), 0, 5);
		add(issNum, 1, 5);

		checkOutButton = new Button("Check Out");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(checkOutButton);
		add(hbBtn, 1, 6);	
		
		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,10));
		add(actiontarget, 1, 7, 2, 1);
	}

	@Override
	public void addListeners() {
		checkOutButton.setOnAction(evt -> {

			try {
				if(ISBN.getText() != null && ISBN.getText().trim() != "")
					getSystemController().checkoutBook(ID.getText(), ISBN.getText());
				else
					getSystemController().checkoutPeriodical(ID.getText(), title.getText(), Integer.valueOf(issNum.getText()));
				
				actiontarget.setText("Checkout copy successfully!");
				
			} catch (LibrarySystemException e) {
				
				actiontarget.setText(e.getMessage());
				
		}
	});				
	}

	@Override
	public void additionalProcessing() {
		// TODO Auto-generated method stub
		
	}

}
