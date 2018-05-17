package javafx_gui;

import javafx.application.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import java.lang.Object;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import    javafx.scene.Parent;
import        javafx.scene.layout.Region;
      import      javafx.scene.control.Control;
            import    javafx.scene.control.Labeled;
                  import  javafx.scene.control.ButtonBase;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
//import javafx.scene.text.TextAlignment;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class FirstTry2 extends Application {
	Stage window;
	Scene scene1,scene2,scene3,scene4;
	@Override
   // Override the start method in the Application class
	
	
  public void start(Stage primaryStage) throws Exception {
		Text text = new Text(); 
	       
	      //Setting font to the text 
	      text.setFont(new Font(45)); 
	       
	      //setting the position of the text 
	      text.setX(50); 
	      text.setY(150);          
	      
	      //Setting the text to be added. 
	      text.setText("Welcome to Movie Mania");
	      text.setFill(Color.GREY);
	      
	      
		GridPane gridPane = new GridPane();
		window=primaryStage;
	    // Process events
		Button btCancel = new Button("Cancel");
	    btCancel.setOnAction(e -> window.setScene(scene2));
	    Button btPurchase = new Button("Purchase");
	    Button btDisplay = new Button("Display");
	    btDisplay.setOnAction(e -> window.setScene(scene3));
	    Scene scene1 = new Scene(gridPane, 600, 300);
	    Button btProceed = new Button("Proceed");
	    btProceed.setOnAction(e -> window.setScene(scene1));
	    Button btAdd = new Button("Add");
	    btAdd.setOnAction(e -> window.setScene(scene4));
	    Group root = new Group();
	    
	    GridPane layout = new GridPane();
	    scene2 = new Scene(root, 600, 300);
	    //Image image = new Image("File:img/img2.jpg");	
	    layout.setLayoutX(0);
        layout.setLayoutY(0);
        layout.setPrefSize(600,300);
        layout.setPadding(new Insets(25));
        layout.setVgap(30);
        layout.setHgap(0);
        Image image = new Image("File:img/img3.jpg");
	    
	    
	    
	    layout.add(text,0,0);
	    layout.add(btProceed,0,1);
	    
	    
	    //text.setAlignment(Pos.TOP_CENTER);
	    GridPane.setValignment(text, VPos.TOP);
	    GridPane.setHalignment(btProceed, HPos.CENTER);
	    layout.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.REPEAT,
	               BackgroundRepeat.NO_REPEAT,
	               BackgroundPosition.DEFAULT,
	                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false))));
	    layout.setAlignment(Pos.CENTER);
	    root.getChildren().add(layout);
	    
	    
	    primaryStage.setScene(scene2);
	    primaryStage.setTitle("Movie Mania"); // Set title
	    primaryStage.show(); // Display the stage
		
        
    // Create UI
		
	   ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
	   ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
	   ChoiceBox<String> choiceBox3 = new ChoiceBox<>();
	   choiceBox1.getItems().add("Avengers");
	   choiceBox1.getItems().addAll("Avatar", "Harry Potter");
	   choiceBox1.setValue("Avengers");
	   String[] getType = {"Standard", "Atmos", "3D"};
	   choiceBox2.getItems().addAll(getType);
	   choiceBox2.setValue("Standard");
	   choiceBox3.getItems().addAll("1 PM", "2 PM");
	   choiceBox3.setValue("1 PM");

	  
	   
	   
	   TextField tfNumberOfYears = new TextField();
	   TextField tfLoanAmount = new TextField();
	   TextField tfSeat = new TextField();
	   final ToggleGroup group1 = new ToggleGroup();
	   final ToggleGroup group2 = new ToggleGroup();

//	   CheckBox tfMonthlyPayment = new CheckBox();
//	   CheckBox box1 = new CheckBox("Yes");
//	   box1.setToggleGroup(group);
//       CheckBox box2 = new CheckBox("No");
//       box2.setToggleGroup(group);
	   RadioButton rb1 = new RadioButton("Yes");
	   rb1.setToggleGroup(group1);
	   rb1.setSelected(true);
	   RadioButton rb2 = new RadioButton("No");
	   rb2.setToggleGroup(group1);
	   rb2.setSelected(true);
	   RadioButton rb3 = new RadioButton("Standard");
	   rb3.setToggleGroup(group2);
	   rb3.setSelected(true);
	   RadioButton rb4 = new RadioButton("Premium");
	   rb4.setToggleGroup(group2);
	   rb4.setSelected(true);
	   HBox box1 = new HBox(20, rb1,rb2);
	   HBox box2 = new HBox(20, rb3,rb4);
	   Text text2 = new Text();
	   text2.setFont(new Font(20));
	   text2.setText("ORDER TICKET");
	   TextField tfTotalPayment = new TextField();
	   
	    
    
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    
    gridPane.add(text2, 0, 0);
    gridPane.add(new Label("Movie Name:"), 0, 2);
    gridPane.add(choiceBox1, 1, 2);
    gridPane.add(new Label("Movie Type:"), 0, 3);
    gridPane.add(choiceBox2, 1, 3);  
    gridPane.add(new Label("Session:"), 0, 4);
    gridPane.add(choiceBox3, 1, 4);
    gridPane.add(new Label("Seat:"), 0, 5);
    gridPane.add(tfSeat, 1, 5);
    gridPane.add(btDisplay, 2, 5);
    gridPane.add(new Label("Student :"), 0, 6);
    gridPane.add(box1,1,6);
    gridPane.add(new Label("Ticket Type :"), 0, 7);
    gridPane.add(box2,1,7);
    gridPane.add(new Label("Quantity:"), 0, 8);
    gridPane.add(tfLoanAmount, 1, 8);
    gridPane.add(new Label("Total Price:"), 0, 9);
    gridPane.add(tfTotalPayment, 1, 9);
    gridPane.add(btCancel, 2, 10);
    gridPane.add(btAdd, 1, 10);
    gridPane.add(btPurchase, 0, 10);
    

    
    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    //choiceBox.setAlignment(Pos.BOTTOM_RIGHT);
    tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
    tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
    //tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
    tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
//    text2.setAlignment(Pos.BOTTOM_RIGHT);
    
    tfLoanAmount.setEditable(false);
    tfTotalPayment.setEditable(false);
   // GridPane.setHalignment(btCancel, HPos.RIGHT);
    GridPane.setHalignment(btPurchase, HPos.RIGHT);
//    GridPane.setHalignment(text2, HPos.CENTER);
//    btPurchase.setOnAction(e -> handleOptions(rb1,rb2));  
//    
//  }
//	private void handleOptions(ChoiceBox choiceBox1, ChoiceBox choiceBox2){
//        String message = "Users order:\n";
//
//        if(choiceBox1.isSelected())
//            message += "Bacon\n";
//
//        if(choiceBox2.isSelected())
//            message += "Tuna\n";
//
//        System.out.println(message);
//    choiceBox2.getSelectionModel().selectedItemProperty().addListener((v.oldValue,newValue)->System.out.println(newValue));
//}
	}
	private void getChoice(ChoiceBox<String> choiceBox1){
        String movie = choiceBox1.getValue();
        String movie2 = choiceBox1.getValue();
        System.out.println(movie);
}
  
  private void calculateLoanPayment() {
    // Get values from text fields
    System.out.println("Noobs");

    // Create a loan object. Loan defined in Listing 10.2
  

    // Display monthly payment and total payment
  
  }
  private void Display() {
	    // Get values from text fields
	  System.out.println("Blah la wei");

	    // Create a loan object. Loan defined in Listing 10.2
	  

	    // Display monthly payment and total payment
	  
	  }
	
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
