package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StrUtilController {

    @FXML
    private TextField in;

    @FXML
    private Button count;

    @FXML
    private TextField out;

    @FXML
    private Button reverse;

    @FXML
    private Button dups;

    @FXML
    void click(ActionEvent event) {
    	count.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String text = in.getText();
				out.setText(Integer.toString(text.length()));

			}
		});
    	reverse.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String text = in.getText();
				char[] charArray = text.toCharArray();
				String reverseString = "";
				for(int i=charArray.length-1;i>=0;i--) {
					reverseString +=charArray[i];
				}
				out.setText(reverseString);
			}
		});
    	dups.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String text = in.getText();
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
				String noDups ="";
				for(int i=0 ;i< count ;i++) {
					noDups += newCharArray[i];
				}
				out.setText(noDups);
			}
		});
    }

}