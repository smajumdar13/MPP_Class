package application;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class SampleController {

    @FXML
    private MenuItem abt;
    @FXML
    private Button btnP;
    @FXML
    private Label lbl;

    @FXML
    void AboutMe(ActionEvent event) {
    	JOptionPane.showMessageDialog(null, "This is a test app");
    }
    @FXML
    void closeApp(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void press(ActionEvent event) {
    	btnP.setText("Pressed");
    	System.out.println("Button has been pressed!");
    }
}
