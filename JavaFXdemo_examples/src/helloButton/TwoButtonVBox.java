package helloButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoButtonVBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Two Button VBox");
		Text txt1 = new Text("Text at the top of the VBox stack");
		Text txt2 = new Text("Text at the bottom of the VBox stack");
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		btn1.setText("This is Button ONE");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
			}
		});
		
		
		btn2.setText("This is Button TWO");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Two pushed");
			}
		});
		

		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(btn1);
		vbox1.getChildren().add(btn2);
		vbox1.getChildren().add(txt2);

		Scene sc = new Scene(vbox1, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
