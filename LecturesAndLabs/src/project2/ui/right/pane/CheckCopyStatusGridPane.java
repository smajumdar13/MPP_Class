package project2.ui.right.pane;



import java.util.List;

import project2.business.Address;
import project2.business.Book;
import project2.business.BookCopy;
import project2.business.CopyStatus;
import project2.business.LendableCopy;
import project2.business.Periodical;
import project2.business.PeriodicalCopy;
import project2.business.SystemController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CheckCopyStatusGridPane extends GeneralGridPane{


	TextField isbn = new TextField();	
	TextField bookCopyNum = new TextField();
	
	TextField issueNumber = new TextField();
	TextField titleForPeriodical = new TextField();
	TextField periodicalCopyNum = new TextField();
	
	Button search;
	
	Text actiontarget;
	
	public  CheckCopyStatusGridPane() {
		build();

	}

	@Override
	public void buildDetails() {
		Label book = new Label("Book");
		book.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(book, 0, 0);
		
		add(new Label("ISBN: "), 0, 1);
		add(isbn, 1, 1);
		add(new Label("Copy Num: "), 0, 2);
		add(bookCopyNum, 1, 2);
		
		Label periodical = new Label("Periodical");
		periodical.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		add(periodical, 0, 5);
		
		add(new Label("Issue Number: "), 0, 6);
		add(issueNumber, 1, 6);
		
		add(new Label("Title: "), 0, 7);
		add(titleForPeriodical, 1, 7);
		
		add(new Label("Copy Num: "), 0, 8);
		add(periodicalCopyNum, 1, 8);
		
		search = new Button("Search");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(search);
		add(hbBtn, 1, 9);	
		
		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL,10));
		add(actiontarget, 1, 10);
	}

	@Override
	public void addListeners() {
		search.setOnAction(evt -> {
			LendableCopy copy = null;
			SystemController control = getSystemController();
			Integer inputVal = null;
			if (isbn.getText() != null && isbn.getText().trim() != ""){	
				Book book = control.searchBook(isbn.getText().trim());
				inputVal = Integer.parseInt(bookCopyNum.getText());
				copy = book.getCopy(inputVal);
				if(copy == null) {
					//display error
					actiontarget.setText("Copy not found");
				}
				
			}
			else {
				Periodical p = control.searchPeriodical(titleForPeriodical.getText(), Integer.valueOf(issueNumber.getText()));
				inputVal = Integer.parseInt(periodicalCopyNum.getText());
				copy = p.getCopy(inputVal);
				if(copy == null) {
					actiontarget.setText("Copy not found");
				}
			}
			CopyStatus status = getSystemController().computeStatus(copy);
			System.out.println(status);
		});		
	}

	@Override
	public void additionalProcessing() {
		// TODO Auto-generated method stub
		
	}
	


}
