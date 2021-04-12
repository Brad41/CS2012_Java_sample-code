package imageShow;

import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoButtonImageChooser extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Two Button VBox");
	// --------------------------------------------------------------------		
		VBox vbox1 = new VBox(10); // the attribute sets the space between nodes
		vbox1.setPadding(new Insets(15, 15, 15, 15)); // sets space around the edges
		
		HBox hbox1 = new HBox(10);
		hbox1.setPadding(new Insets(15, 15, 15, 15));
		hbox1.setStyle("-fx-background-color: CYAN");
		
		ImageView imageHolder1 = new ImageView();
		imageHolder1.setFitHeight(300);
		imageHolder1.setPreserveRatio(true);
		
	// --------------------------------------------------------------------
		Text txt1 = new Text("Text at the top of the VBox stack");
		Text txt2 = new Text("Text at the bottom of the VBox stack");
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		File imgFile1 = new File("robotRineo.jpg"); // in default Eclipse file location
		String imgFileloc1 = imgFile1.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.
		Image image1 = new Image(imgFileloc1);
			
		Image image2 = new Image(new File("images/SpaceSuit.jpg").toURI().toURL().toExternalForm());
		
		
	// --------------------------------------------------------------------		
		btn1.setText("This is Button ONE");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button One pushed");
				txt1.setText("Button ONE pushed");
				imageHolder1.setImage(image1);
			}
		});
		
		
		btn2.setText("This is Button TWO");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button Two pushed");
				txt1.setText("Button TWO pushed");
				imageHolder1.setImage(image2);
			}
		});
	// --------------------------------------------------------------------		

		
		
		hbox1.getChildren().add(btn1);
		hbox1.getChildren().add(btn2);
			
		vbox1.getChildren().add(hbox1);
		vbox1.getChildren().add(txt1);
		vbox1.getChildren().add(txt2);
		
		vbox1.getChildren().add(imageHolder1);

		Scene sc = new Scene(vbox1, 450, 500);
		//Scene sc = new Scene(vbox1);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	// ---- methods -------------------------------------------------
	
	
	
	
	// ---------------------------------------------------------------
	public static void main(String[] args) {
		Application.launch(args);
	}
}