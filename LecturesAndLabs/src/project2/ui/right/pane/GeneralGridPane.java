package project2.ui.right.pane;

import project2.business.SystemController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public abstract class GeneralGridPane extends GridPane {

	private SystemController systemController = new SystemController();

	public GridPane getPane() {
		return this;
	}

	public void build() {
		setAlignment(Pos.CENTER);
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(25, 25, 25, 105));
		
		buildDetails();
		addListeners();
		additionalProcessing();
	}

	public SystemController getSystemController() {
		return systemController;
	}

	public abstract void buildDetails();

	public abstract void addListeners();

	public abstract void additionalProcessing();
}
