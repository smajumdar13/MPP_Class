package project2.ui.right.pane;

import project2.business.Address;
import project2.business.SystemController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class AddMemberGridPane extends GeneralGridPane {

	TextField ID = new TextField();
	TextField fname = new TextField();
	TextField lname = new TextField();
	TextField street = new TextField();
	TextField city = new TextField();
	TextField state = new TextField();
	TextField zip = new TextField();
	TextField cell = new TextField();
	Button addButton;
	Text actiontarget;


	public AddMemberGridPane() {
		build();

	}

	@Override
	public void buildDetails() {
		add(new Label("ID: "), 0, 1);
		add(ID, 1, 1);

		add(new Label("First Name: "), 0, 2);
		add(fname, 1, 2);

		add(new Label("Last Name: "), 0, 3);
		add(lname, 1, 3);

		add(new Label("Street: "), 0, 4);
		add(street, 1, 4);

		add(new Label("City: "), 0, 5);
		add(city, 1, 5);

		add(new Label("State: "), 0, 6);
		add(state, 1, 6);

		add(new Label("Zip: "), 0, 7);
		add(zip, 1, 7);

		add(new Label("Cell: "), 0, 8);
		add(cell, 1, 8);

		addButton = new Button("Add");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(addButton);
		add(hbBtn, 1, 9);

		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,10));
		add(actiontarget, 1, 10);

	}

	@Override
	public void addListeners() {

		addButton.setOnAction(evt -> {

			// TO-DO: should have different signature of addNewMember
				Address address = new Address(street.getText(), city.getText(),
						state.getText(), zip.getText());
				try {
					getSystemController().addNewMember(ID.getText(), fname.getText(),
							lname.getText(), cell.getText(), address);
					actiontarget.setText("Add Member successfully!");
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
