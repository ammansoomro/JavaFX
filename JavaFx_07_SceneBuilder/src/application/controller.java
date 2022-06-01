package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class controller {
	@FXML
	private Circle mycircle;
	double x,y;
	public void up(ActionEvent e) {
		mycircle.setCenterY(y=y-10);
	}

	public void down(ActionEvent e) {
		mycircle.setCenterY(y=y+10);
	}

	public void left(ActionEvent e) {
		mycircle.setCenterX(x=x-10);
	}

	public void right(ActionEvent e) {
		mycircle.setCenterX(x=x+10);
	}
}
