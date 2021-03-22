package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddressBox extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Address Form");
		GridPane gridFirstRow = new GridPane();
		gridFirstRow.setAlignment(Pos.CENTER);
		gridFirstRow.setHgap(25);
		
		Label lblName = new Label("Name");
		gridFirstRow.add(lblName, 0, 0);
		TextField txtName = new TextField();
		gridFirstRow.add(txtName, 0, 1);
		
		Label lblStreet = new Label("Street");
		gridFirstRow.add(lblStreet, 1, 0);
		TextField txtStreet = new TextField();
		gridFirstRow.add(txtStreet, 1, 1);

		Label lblCity = new Label("City");
		gridFirstRow.add(lblCity, 2, 0);
		TextField txtCity = new TextField();
		gridFirstRow.add(txtCity, 2, 1);

		GridPane gridSecondRow = new GridPane();
		gridSecondRow.setAlignment(Pos.CENTER);
		gridSecondRow.setHgap(10);
		
		Label lblState = new Label("State");
		gridSecondRow.add(lblState, 0, 0);
		TextField txtState = new TextField();
		gridSecondRow.add(txtState, 0, 1);
		Label lblZip = new Label("Zip");
		gridSecondRow.add(lblZip, 1, 0);
		TextField txtZip = new TextField();
		gridSecondRow.add(txtZip, 1, 1);
		
		Button btn = new Button("Submit");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(String.format("%s\n%s\n%s, %s %s", txtName.getText(),txtStreet.getText(),txtCity.getText(),txtState.getText(),txtZip.getText()));
				
			}
		});
		
		VBox vbox = new VBox(20,gridFirstRow, gridSecondRow,btn);
		vbox.setPadding(new Insets(15, 25, 25, 15));
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 700, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
