package chapter14;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane gp = new GridPane();
    gp.setAlignment(Pos.CENTER);
    gp.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    gp.setHgap(20.5);
    gp.setVgap(5.5);
    
    // Place nodes in the pane
    gp.add(new Label("First Name:"), 0, 0);
    gp.add(new TextField(), 1, 0);
    gp.add(new Label("MI:"), 0, 1); 
    gp.add(new TextField(), 1, 1);
    gp.add(new Label("Last Name:"), 0, 2);
    gp.add(new TextField(), 1, 2);
    Button btAdd = new Button("Add Name");
    gp.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(gp);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
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