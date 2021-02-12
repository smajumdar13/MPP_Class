package project.ui;

import project.business.LibraryMember;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class MemberWindow extends Stage {
	private TableView<CheckoutRecordView.CheckoutRecordEntryView> table = new TableView<>();
	Text messageBar = new Text();
	Stage mainWindow;
	public void setData(ObservableList<CheckoutRecordView.CheckoutRecordEntryView> items) {
		ObservableList<CheckoutRecordView.CheckoutRecordEntryView> current = table.getItems();
		if(current != null) {
			current.addAll(items);
		}
		table.setItems(current);
	}
	public MemberWindow(Stage mainWindow) {
		this.mainWindow = mainWindow;
		setTitle("Library Member Info");
		messageBar.setFill(Color.FIREBRICK);
		
		final Label label = new Label(String.format("Library Member Info"));
        label.setFont(new Font("Arial", 16));
        HBox labelHbox = new HBox(10);
        labelHbox.setAlignment(Pos.CENTER);
        labelHbox.getChildren().add(label);
		
        table.setEditable(false);
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> indexCol 
		  = new TableColumn<>("Index");
		indexCol.setMinWidth(80);
		indexCol.setCellValueFactory(
            new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("index"));
		indexCol.setCellFactory(TextFieldTableCell.forTableColumn());
		indexCol.setEditable(false);
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> checkoutDateCol 
		  = new TableColumn<>("Checkout Date");
		checkoutDateCol.setMinWidth(80);
		checkoutDateCol.setCellValueFactory(
          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("checkoutDate"));
		checkoutDateCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> dueDateCol 
		  = new TableColumn<>("Due Date");
		dueDateCol.setMinWidth(80);
		dueDateCol.setEditable(false);
		dueDateCol.setCellValueFactory(
          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("dueDate"));
		dueDateCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> pubTypeCol 
		  = new TableColumn<>("Publication Type");
		pubTypeCol.setMinWidth(80);
		pubTypeCol.setEditable(false);
		pubTypeCol.setCellValueFactory(
		          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("pubType"));
		pubTypeCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> titleCol 
		  = new TableColumn<>("Title");
		titleCol.setMinWidth(80);
		titleCol.setEditable(false);
		titleCol.setCellValueFactory(
		          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("title"));
		titleCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> isbnIssueNumCol 
		  = new TableColumn<>("ISBN/Issue Num");
		isbnIssueNumCol.setMinWidth(80);
		isbnIssueNumCol.setEditable(false);
		isbnIssueNumCol.setCellValueFactory(
		          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("isbnIssueNum"));
		isbnIssueNumCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> copyNumCol 
		  = new TableColumn<>("Copy Number");
		copyNumCol.setMinWidth(80);
		copyNumCol.setEditable(false);
		copyNumCol.setCellValueFactory(
		          new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>("copyNum"));
		copyNumCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		table.getColumns().addAll(indexCol, checkoutDateCol, dueDateCol, pubTypeCol, titleCol, isbnIssueNumCol, copyNumCol);
		
		
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10); 
		grid.setHgap(10);
		grid.add(labelHbox, 0, 0);
		grid.add(table, 0, 1);
		grid.add(messageBar, 0, 2);

        Scene scene = new Scene(grid, 500, 300);  
		setScene(scene);
	}
}
