package application;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class PopupWindow {
	public static void Display(String message) {
		Stage Window = new Stage();

		Window.initModality(Modality.APPLICATION_MODAL);
		Window.setTitle("Pop Up");
		Window.setWidth(150);
		Window.setHeight(150);

		Button btn1 = new Button("Close");
		btn1.setOnAction(e -> Window.close());

		Label lbl1 = new Label(message);

		VBox layout = new VBox();
		layout.getChildren().add(btn1);
		layout.getChildren().add(lbl1);

		Scene scene = new Scene(layout);

		Window.setScene(scene);
		Window.showAndWait();

	}
}
