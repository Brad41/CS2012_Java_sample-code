package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {    
    // Create a pane to hold the circle 

	  Pane pane = new StackPane();
	  
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.radiusProperty().bind(pane.heightProperty().divide(4)) ;
//    pane.widthProperty().divide(3));
//    circle.centerYProperty().bind(pane.heightProperty().divide(3));
    circle.setStroke(Color.BLACK); 
    circle.setFill(new Color(1.0, 0.0, 0.0, 0.9));
    

    // Create a label and set its properties
    Label label = new Label("JavaFX");
    label.setFont(Font.font("Arial", 
      FontWeight.BOLD, FontPosture.ITALIC, 50));
    //Setting the color of the text
    label.setTextFill(Color.BLUE);
    //Setting the width
    
    
    pane.getChildren().add(circle); // Add circle to the pane
    pane.getChildren().add(label);



    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("FontDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
