package project2.ui.right.pane;

import java.util.List;

import project2.business.Address;
import project2.business.LibraryMember;
import project2.ui.CheckoutRecordView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class SearchMemberGridPane extends GeneralGridPane {

	TextField ID = new TextField();
	TextField fname = new TextField();
	TextField lname = new TextField();
	TextField street = new TextField();
	TextField city = new TextField();
	TextField state = new TextField();
	TextField zip = new TextField();
	TextField cell = new TextField();
	Button searchButton;
	Button updateButton;
	Button printButton;
	TableView<CheckoutRecordView.CheckoutRecordEntryView> table = new TableView<CheckoutRecordView.CheckoutRecordEntryView>();

	Text actiontarget;

	public void setData(ObservableList<CheckoutRecordView.CheckoutRecordEntryView> items) {
		
		table.setItems(items);
	}

	public SearchMemberGridPane() {

		build();
	}

	@Override
	public void buildDetails() {
		add(new Label("ID: "), 0, 1);
		add(ID, 1, 1);

		searchButton = new Button("Search");
		add(searchButton, 2, 1);

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

		updateButton = new Button("Update");
		HBox hbBtn1 = new HBox(10);
		hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn1.getChildren().add(updateButton);
		add(hbBtn1, 1, 9);

		actiontarget = new Text();
		actiontarget.setFont(Font.font("Tahoma", FontWeight.NORMAL, 10));
		add(actiontarget, 1, 10);
		
		printButton = new Button("Print Record");
		add(printButton, 2, 11);

		table.setEditable(false);
		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> indexCol = new TableColumn<>(
				"Index");
		indexCol.setMinWidth(80);
		indexCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
				"index"));
		indexCol.setCellFactory(TextFieldTableCell.forTableColumn());
		indexCol.setEditable(false);

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> checkoutDateCol = new TableColumn<>(
				"Checkout Date");
		checkoutDateCol.setMinWidth(80);
		checkoutDateCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
						"checkoutDate"));
		checkoutDateCol.setCellFactory(TextFieldTableCell.forTableColumn());

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> dueDateCol = new TableColumn<>(
				"Due Date");
		dueDateCol.setMinWidth(80);
		dueDateCol.setEditable(false);
		dueDateCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
						"dueDate"));
		dueDateCol.setCellFactory(TextFieldTableCell.forTableColumn());

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> pubTypeCol = new TableColumn<>(
				"Publication Type");
		pubTypeCol.setMinWidth(80);
		pubTypeCol.setEditable(false);
		pubTypeCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
						"pubType"));
		pubTypeCol.setCellFactory(TextFieldTableCell.forTableColumn());

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> titleCol = new TableColumn<>(
				"Title");
		titleCol.setMinWidth(80);
		titleCol.setEditable(false);
		titleCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
				"title"));
		titleCol.setCellFactory(TextFieldTableCell.forTableColumn());

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> isbnIssueNumCol = new TableColumn<>(
				"ISBN/Issue Num");
		isbnIssueNumCol.setMinWidth(80);
		isbnIssueNumCol.setEditable(false);
		isbnIssueNumCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
						"isbnIssueNum"));
		isbnIssueNumCol.setCellFactory(TextFieldTableCell.forTableColumn());

		TableColumn<CheckoutRecordView.CheckoutRecordEntryView, String> copyNumCol = new TableColumn<>(
				"Copy Number");
		copyNumCol.setMinWidth(80);
		copyNumCol.setEditable(false);
		copyNumCol.setCellValueFactory(new PropertyValueFactory<CheckoutRecordView.CheckoutRecordEntryView, String>(
						"copyNum"));
		copyNumCol.setCellFactory(TextFieldTableCell.forTableColumn());

		table.getColumns().addAll(indexCol, checkoutDateCol, dueDateCol,
				pubTypeCol, titleCol, isbnIssueNumCol, copyNumCol);

		add(table, 0, 12, 3, 1);

		
	}

	@Override
	public void addListeners() {

		searchButton.setOnAction(evt -> {
			clear();
			LibraryMember member = getSystemController().search(ID.getText());
			if (member == null){
				actiontarget.setText("No member found!");
				this.setData(null);
			}
			
			else{
				fill(member);
				List<CheckoutRecordView.CheckoutRecordEntryView> entries 
				   = (new CheckoutRecordView(
						 member)).getEntryViews();
				this.setData(FXCollections.observableList(entries));
			}
			
		});

		updateButton.setOnAction(evt -> {
			Address address = new Address(street.getText(), city.getText(),
					state.getText(), zip.getText());
			try {
				getSystemController().updateMemberInfo(ID.getText(),
						fname.getText(), lname.getText(), cell.getText(),
						address);
				actiontarget.setText("Update Member successfully!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		printButton.setOnAction(evt -> {
			
			try {
				getSystemController().printCheckoutRecord(ID.getText());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	private void fill(LibraryMember member) {

		fname.setText(member.getFirstName());
		lname.setText(member.getLastName());

		Address address = member.getAddress();
		street.setText(address.getStreet());

		city.setText(address.getCity());
		state.setText(address.getState());
		zip.setText(address.getZip());
		cell.setText(member.getTelephone());
	}

	private void clear() {

		fname.setText("");
		lname.setText("");
		street.setText("");
		city.setText("");
		state.setText("");
		zip.setText("");
		cell.setText("");
		actiontarget.setText("");
	}
	
	@Override
	public void additionalProcessing() {

	}

}
