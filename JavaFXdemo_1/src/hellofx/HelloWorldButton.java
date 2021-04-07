package hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldButton extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		System.out.println("top of start class");

		primaryStage.setTitle("Hello World! window title");

		Text tx = new Text("Look at this awesome text!.Hidden behind the button");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");

		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello to the World!");
			}

			// might have to use this version instead, and I don't yet know why
//			@Override
//			public void handle(Event event) {
//				System.out.println("Hello to the World!");
//			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(tx);
		root.getChildren().add(btn);

		Scene sc = new Scene(root, 400, 250);
		primaryStage.setScene(sc);
		primaryStage.show();

		System.out.println("bottom of start class");
	}

}
