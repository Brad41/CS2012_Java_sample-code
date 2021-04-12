package imageShow;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageExamples_1 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException, Exception {
		// Create a pane to hold the image views
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));


		System.out.print("This project level image storage-> "); 
		File sampleImageFile1 = new File("crazyCat.jpg");
		
		System.out.print("checking if file exists-> "); 
		System.out.println(sampleImageFile1.exists());
		
		String sampleImageFile1_locationString = sampleImageFile1.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.
		System.out.print("getting the full absolute path location-> "); 
		System.out.println(sampleImageFile1_locationString);

		Image catImage = new Image(sampleImageFile1_locationString, false); //false => does not load in background, loads immediately
		ImageView catView = new ImageView(catImage);
		pane.getChildren().add(catView);
		System.out.println("-------------------------");
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

	
//--------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}
