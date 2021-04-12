package shapesAndDrawing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SimpleCircles extends Application {
	
	  @Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
		  
	    // Create a circle and set its properties
	    Circle mycircle = new Circle();
	    mycircle.setCenterX(100);
	    mycircle.setCenterY(100);
	    mycircle.setRadius(50);
	    mycircle.setStroke(Color.BLACK);
	    mycircle.setFill( Color.color(0.7, 0.25, 0.8) );
	    
	    // Create a pane to hold the circle 
	    Pane myPane = new Pane();
	    myPane.getChildren().add(mycircle);
	    
	    myPane.setStyle("-fx-background-color: CYAN");
	    
	    // Create a scene and place it in the stage

	    primaryStage.setTitle("ShowCircle"); // Set the stage title
	    primaryStage.setScene(new Scene(myPane, 200, 200)); // Place the scene in the stage
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

