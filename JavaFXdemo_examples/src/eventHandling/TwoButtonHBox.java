package eventHandling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TwoButtonHBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Two Button HBox");

		HBox hPane = new HBox(10); // the 10 is the space between the buttons (nodes)
		hPane.setAlignment(Pos.CENTER);

		Button btn1 = new Button("This is Button ONE");
		Button btn2 = new Button("This is Button TWO");

		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
			}
		});

		btn2.setOnAction(				
				new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Two pushed");
			}
		});
		
		Button btn3 = new Button("THREE");
		btn3.setOnAction(new GenericButton_two());

		hPane.getChildren().add(btn1);
		hPane.getChildren().add(btn2);
		hPane.getChildren().add(btn3);

		Scene sc = new Scene(hPane, 300, 50);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
