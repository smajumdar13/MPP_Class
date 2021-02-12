package project2.ui.right.pane;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import project2.business.Author;


public class AddPublicationGridPane extends GeneralGridPane {

	TextField isbn = new TextField();
	TextField fname = new TextField();
	TextField lname = new TextField();
	TextField credentials = new TextField();
	TextField title = new TextField();
	TextField maxCheckOutLength = new TextField();
	
	
	TextField issueNumber = new TextField();
	TextField titleForPeriodical = new TextField();
	TextField maxCheckOutLengthForPeriodical = new TextField();
	
	Button addButton;
	Text actiontarget;

	public AddPublicationGridPane() {
		build();

	}

	@Override
	public void buildDetails() {

		Text scenetitle = new Text("Add a Book");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(scenetitle, 0, 0, 2, 1);
		
		add(new Label("ISBN: "), 0, 1);
		add(isbn, 1, 1);

		add(new Label("Author First Name: "), 0, 2);
		add(fname, 1, 2);

		add(new Label("Author Last Name: "), 0, 3);
		add(lname, 1, 3);

		add(new Label("Credentials: "), 0, 4);
		add(credentials, 1, 4);

		add(new Label("Title: "), 0, 5);
		add(title, 1, 5);

		add(new Label("Max Checkout Length: "), 0, 6);
		add(maxCheckOutLength, 1, 6);

		Text periodicalSection = new Text("Add a Periodical");
		periodicalSection.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(periodicalSection, 0, 7, 2, 1);
		
		add(new Label("Issue Number: "), 0, 8);
		add(issueNumber, 1, 8);

		add(new Label("Title: "), 0, 9);
		add(titleForPeriodical, 1, 9);

		add(new Label("Max Checkout Length: "), 0, 10);
		add(maxCheckOutLengthForPeriodical, 1, 10);
		
		addButton = new Button("Add");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(addButton);
		add(hbBtn, 1, 11);
		
		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,10));
		add(actiontarget, 1, 12);
	}

	@Override
	public void addListeners() {
		
		addButton.setOnAction(evt -> {
			

				try {
					if (isbn.getText() != null && isbn.getText().trim() != ""){
						List<Author> authors = new ArrayList<Author>();
						authors.add(new Author(fname.getText(), lname.getText(), "", null, credentials.getText()));
						getSystemController().addBook(isbn.getText(), title.getText(), Integer.valueOf(maxCheckOutLength.getText()), authors);
					}
					else {
						getSystemController().addPeriodical(Integer.valueOf(issueNumber.getText()), titleForPeriodical.getText(), Integer.valueOf(maxCheckOutLengthForPeriodical.getText()));
					}
					actiontarget.setText("Add Publication successfully!");
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
