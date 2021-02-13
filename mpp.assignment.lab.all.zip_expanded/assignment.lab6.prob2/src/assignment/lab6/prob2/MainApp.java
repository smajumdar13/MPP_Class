package assignment.lab6.prob2;

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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("String Utility");

		// right content
		GridPane rightGrid = new GridPane();
		// rightGrid.setAlignment(Pos.CENTER);
		rightGrid.setHgap(10);
		Label lblInput = new Label("Input");
		TextField txtInput = new TextField();
		rightGrid.add(lblInput, 0, 0);
		rightGrid.add(txtInput, 0, 1);

		Label lblOutput = new Label("Output");
		TextField txtOutput = new TextField();
		rightGrid.add(lblOutput, 0, 2);
		rightGrid.add(txtOutput, 0, 3);

		Button btnCountLetters = new Button("Count Letters");

		btnCountLetters.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text = txtInput.getText();
				txtOutput.setText(Integer.toString(text.length()));

			}
		});

		btnCountLetters.setId("button");
		Button btnReverseLetters = new Button("Reverse Letters");
		btnReverseLetters.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String text = txtInput.getText();
				char[] charArray = text.toCharArray();
				String reverseString = "";
				for(int i=charArray.length-1;i>=0;i--) {
					reverseString +=charArray[i];
				}
				txtOutput.setText(reverseString);
				
			}
		});
		btnReverseLetters.setId("button");
		Button btnRemoveDuplicates = new Button("Remove Duplicates");
		btnRemoveDuplicates.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text = txtInput.getText();
				char[] charArray = text.toCharArray();
				int count =0;
				char[] newCharArray = new char[text.length()];
				for(int i=0 ;i< charArray.length ;i++) {
					boolean hasDup = false;
					for(char c: newCharArray) {
						
						if (c == charArray[i] && !Character.isSpaceChar(c)) {
							hasDup = true;
							break;
						}
						
					}
					if(!hasDup) newCharArray[count++] = charArray[i];
				}
				String finalText ="";
				for(int i=0 ;i< count ;i++) {
					finalText += newCharArray[i];
				}
				txtOutput.setText(finalText);
			}
		});
		btnRemoveDuplicates.setId("button");

		VBox leftVbox = new VBox(10, btnCountLetters, btnReverseLetters, btnRemoveDuplicates);

		HBox hBoxmainContainer = new HBox(10, leftVbox, rightGrid);
		hBoxmainContainer.setPadding(new Insets(10, 25, 10, 25));
		hBoxmainContainer.setAlignment(Pos.CENTER);
		// leftgrid.add(b, arg1, arg2);

		Scene scene = new Scene(hBoxmainContainer);
		scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
