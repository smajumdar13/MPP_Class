package project2.ui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project2.ui.right.pane.AddCopyGridPane;
import project2.ui.right.pane.AddMemberGridPane;
import project2.ui.right.pane.AddPublicationGridPane;
import project2.ui.right.pane.AllBookIdsGridPane;
import project2.ui.right.pane.AllMemberIdsGridPane;
import project2.ui.right.pane.CheckCopyStatusGridPane;
import project2.ui.right.pane.CheckOutGridPane;
import project2.ui.right.pane.GeneralGridPane;
import project2.ui.right.pane.SearchMemberGridPane;
 
public class Main extends Application {
	 
 
    static String[] buttons = new String[]{
        "Add Member",
        "Search/Edit Member",
        "CheckOut",
        "Add Publication",
        "Add a Copy",
        "Check Copy Status",
        "See All Member Ids",
        "See All Book Ids"
    };
    static GeneralGridPane[] panes =
    	{new AddMemberGridPane(), new SearchMemberGridPane(),
    		new CheckOutGridPane(), new AddPublicationGridPane(),
    		new AddCopyGridPane(), new CheckCopyStatusGridPane(),
    		new AllMemberIdsGridPane(), new AllBookIdsGridPane()
    	};
    
    private Pane rightPane = new Pane();
    final Hyperlink[] hpls = new Hyperlink[buttons.length];
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Library System");
        stage.setWidth(800);
        stage.setHeight(650);
 
        rightPane.setLayoutX(100);
        rightPane.setLayoutY(10);
 
        for (int i = 0; i < buttons.length; i++) {
            hpls[i] = new Hyperlink(buttons[i]);
            
        }
        
        addActionsToButton();
     
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hpls);
        vbox.setSpacing(15);
        vbox.setPadding(new Insets(45, 25, 25, 25));
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox, rightPane);
        stage.setScene(scene);
        stage.show();
    }

	private void addActionsToButton() {
		
		 for (int i = 0; i < buttons.length; i++) {
	         Hyperlink hl = hpls[i] ;
	         final int temp = i;
	         hl.setOnAction(evt -> {
	        		rightPane.getChildren().clear();
	        		GeneralGridPane p = panes[temp];
                	rightPane.getChildren().add(p.getPane());
	         });
	            
	     }
	}
}