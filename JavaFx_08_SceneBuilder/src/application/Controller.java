package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	CheckBox cb;
	@FXML
	Label lbl;
	
	public void check(ActionEvent e)
	{
		if(cb.isSelected())
		{
			lbl.setText("ON");
		}
		else
		{
			lbl.setText("OFF");
		}
	}
	
}

