package eventHandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class GenericButton_two implements EventHandler<ActionEvent> {
	String localVar = "something";
	static String fred = "class level thing";

	@Override
	public void handle(ActionEvent xyz) {
		System.out.println("some button was clicked");
		localVar = xyz.getSource().toString();
		System.out.println(localVar);
	}
}
