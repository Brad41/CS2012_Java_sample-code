package eventHandling;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TwoButtonHBoxWithEventClasses extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		HBox hPane = new HBox(10);
		hPane.setAlignment(Pos.CENTER);

		Button btn1 = new Button("OK");
		Button btn2 = new Button("Cancel");

//		GenericButton myHandlerA = new GenericButton();
//		GenericButton myHandlerB = new GenericButton();
		
//		btn1.setOnAction(new GenericButton());		
//		btn2.setOnAction(new GenericButton());
		
		OKHandlerClass handler1 = new OKHandlerClass(); // this class is created down at the bottom of page
		CancelHandlerClass handler2 = new CancelHandlerClass(); // this class is created down at the bottom of page
		
		btn1.setOnAction(handler1);
		btn2.setOnAction(handler2);

		hPane.getChildren().add(btn1);
		hPane.getChildren().add(btn2);

		// Create a scene and place it in the stage
		Scene scene = new Scene(hPane, 400, 50);
		primaryStage.setTitle("HandleEvent"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	// ---------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
} // <- this is the end of the HandleEvent Class


// ####################################################################


class GenericButton implements EventHandler<ActionEvent> {
	String localVar = "something";
	static String fred = "class level thing";
	
	@Override
	public void handle(ActionEvent xyz) {
		System.out.println("some button was clicked");
		localVar = xyz.getSource().toString();
		System.out.println(localVar);
	}
}

class OKHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent xyz) {
		System.out.println("OK button clicked");
	}
}


class CancelHandlerClass implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent xyz) {
		System.out.println(xyz.getSource().toString());	
		System.out.println("Cancel button clicked");
	}
}
