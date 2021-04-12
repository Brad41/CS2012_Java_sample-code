JavaFX project setup for Eclipse



Download the JavaFX library - Best choice this semester would probably be JavaFX-11.0.10  LTS (Long Term Support). The higher version numbers will probably also work  ... but they won't be supported by the time you come back to these projects in a year or more.

Website:  https://openjfx.io/


Downloads link:  https://gluonhq.com/products/javafx/


Make sure to download the file into a location you can find later, such as C:\JavaCS2012

Once you have the file downloaded unzip it.




The rest of these steps assume you are using the Eclipse IDE.

Make a new Java Project, use next and make sure the setting 'Create module-info.java file' box is checked.

Click Finish and rename the module with a lowercase first letter. Finish.


In the src folder R-click and make a new Package. Make sure the 'Create package-info java' box is checked.

Make a new Class file in the package. Go ahead and add a main() function to this one for testing purposes.

Add a System.out.println("whatever"); and run it to make sure that the basic Java project is working first.




Next:

You will have to do these steps for every JavaFX project you make.


R-click on the Project name -> Configure Build Path
Libraries tab -> Modulepath -> Add External JARs (opens file dialog window)
    navigate to location of unpacked javaFX package -> lib -> select a library to import

    Main Libraries we will need:
        javafx.base
        javafx.controls
        javafx.graphics
        
    Additional Libraries for later chapters:
        javafx.fxml
        javafx.media
        
    
Edit the file  module-info.java  located in the project folder.
~~~
    module <project name> {
        requires javafx.base;
        requires javafx.graphics;
        requires javafx.controls;
        
        exports <package name>;
    }
~~~



Past this example code into your Class file and see if it will run and make a GUI window with a button in it.

~~~

package <your package name here>

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class <your class name here> extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World! window title");
		Text tx = new Text("Look at this awesome text!.Hidden behind the button");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
        
		btn.setOnAction(new EventHandler() {
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
	}

}

~~~





 
