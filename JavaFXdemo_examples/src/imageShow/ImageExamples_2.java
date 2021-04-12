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

public class ImageExamples_2 extends Application {
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
		
		//--------------------------------------------------------
		
		System.out.print("This project level image storage-> "); 
		File imgFile2 = new File("robotRineo.jpg"); //in default Eclipse file location
		
		System.out.print("checking if file exists-> "); 
		System.out.println(imgFile2.exists());
		
		String imgFile2loc = imgFile2.toURI().toURL().toExternalForm(); // the Image constructor needs an absolute path.
		System.out.print("getting the full absolute path location-> "); 
		System.out.println(imgFile2loc);

		Image file2Image = new Image(imgFile2loc, false); //false => does not load in background, loads immediately
		ImageView file2ImageView = new ImageView(file2Image);
		pane.getChildren().add(file2ImageView);
		
		// -------------------------------------------------------
		// without all the printing clutter
		// using a location in a sub-folder 'images'
		
		File imgFile3 = new File("images/mouseTeddy.jpg"); //in default Eclipse file location		
		String imgFile3loc = imgFile3.toURI().toURL().toExternalForm(); // Produces the absolute path the Image constructor needs
		Image file3Image = new Image(imgFile3loc); 
		ImageView file3ImageView = new ImageView(file3Image);
		pane.getChildren().add(file3ImageView);
		

		// -------------------------------------------------------
		
		// all in one line (yuck) using an absolute file path in local file system
		pane.getChildren().add(new ImageView(new Image( "file:/media/rkjc/TECH/Workspace/Workshop-Programming/Java-Workbench/_IDE_Eclipse-workspace/JavaFXdemo_examples/images/SpaceSuit.jpg"  , false)));
		System.out.println("-------------------------");
		
		// all in one line using a URL link path
		pane.getChildren().add(new ImageView(new Image( "https://fanart.tv/fanart/tv/80534/tvposter/happy-tree-friends-569227864b41c.jpg"  , false)));
		System.out.println("-------------------------");
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}