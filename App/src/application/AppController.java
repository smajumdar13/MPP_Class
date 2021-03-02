package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AppController {

    @FXML
    private Text logInMsg;
    @FXML
    private TextField uname;
    @FXML
    private PasswordField pwd;
    @FXML
    private Button logInBtn;
    @FXML
    void press(ActionEvent event) {
    	if(uname.equals("sam") && pwd.equals("hello"))
    		logInMsg.setText("Welcome In!!");
    	else
    		logInMsg.setText("Wrong username or password.");
    		
    		
    }
}
