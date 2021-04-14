JavaFX project setup for Eclipse  
-

---

AdoptOpenJDK 11:  
-

This is from the AdoptOpenJDK website (asof 2021-04-12).

They are in the process of moving over to the Eclipse website and becoming Adoptium. (AdoptiumJava, OpenAdoptiumJDK, or OpenJDK, not sure what it will turn into)

Currently available here (eventually this will probably lead to the Eclipse site).

https://adoptopenjdk.net/releases.html (Links to an external site.)

For this class (Spring 2021) download OpenJDK 11 64-bit.

 

For Windows get - jdk-11.0.10+9 Windows x64 Normal JDK .zip version 
https://github.com/AdoptOpenJDK/openjdk11-binaries/releases/download/jdk-11.0.10%2B9/OpenJDK11U-jdk_x64_windows_hotspot_11.0.10_9.zip (Links to an external site.)

Unpack it in a folder where you can find it and run the eclipse.exe to run the program directly.

 

For Mac get: jdk-11.0.10+9 macOS x64 Normal JDK .pkg version 
https://github.com/AdoptOpenJDK/openjdk11-binaries/releases/download/jdk-11.0.10%2B9/OpenJDK11U-jdk_x64_mac_hotspot_11.0.10_9.pkg (Links to an external site.)

For Mac you will have to install the pkg file. Make sure as you go through the install procedure you write down of screen-shot the path location where Mac is going to install the library files.

 
---
 
OpenJFX:  
-

Web link to downloads  - probably best to use the current Stable release (ver 16 asof 2021-04-12)

https://gluonhq.com/products/javafx/ 

Make sure to use the JavaFX SDK (not the jmods).

Make sure to download the file into a location you can find later, such as C:\JavaCS2012

Once you have the file downloaded unzip it.

---

 
Eclipse IDE:  
-

https://www.eclipse.org/downloads/


---


The rest of these steps assume you are using the Eclipse IDE.

Make a new Java Project, use next and make sure the setting 'Create module-info.java file' box is checked.

Click Finish and rename the module with a lowercase first letter. Finish.


In the src folder R-click and make a new Package. Make sure the 'Create package-info java' box is checked.

Make a new Class file in the package. Go ahead and add a main() function to this one for testing purposes.

Add a `System.out.println("whatever");` and run it to make sure that the basic Java project is working first.




Next:

You will have to do these steps for every JavaFX project you make.


R-click on the Project name -> Configure Build Path
Libraries tab -> Modulepath -> Add External JARs (opens file dialog window)
    navigate to location of unpacked javaFX package -> lib -> select a library to import

~~~
    Main Libraries we will need:
        javafx.base
        javafx.controls
        javafx.graphics
        
    Additional Libraries for later chapters:
        javafx.fxml
        javafx.media
~~~   

Edit the file  module-info.java  located in the project folder.

~~~java:
    module <project name> {
        requires javafx.base;
        requires javafx.graphics;
        requires javafx.controls;
        
        exports <package name>; //without the angle brackets
    }
~~~



Past this example code into your Class file and see if it will run and make a GUI window with a button in it.

~~~java:

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
	        
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hello to the World!");
				}
	            
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





 
