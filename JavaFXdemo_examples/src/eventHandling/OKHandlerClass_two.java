package eventHandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;


class OKHandlerClass_two implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent xyz) {
		System.out.println("OK button clicked");
		System.out.println(xyz.getSource().toString());
	}
}
