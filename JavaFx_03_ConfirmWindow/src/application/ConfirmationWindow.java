package application;

import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
public class ConfirmationWindow {

	static String answer = "";
	public static String Confirm() {
		Stage window = new Stage();
		Button btn01, btn02;
		btn01 = new Button("No");
		btn02 = new Button("Yes");
		btn01.setOnAction(e -> {
			answer = "No, Your Mom Gay.";
			window.close();
		});
		btn02.setOnAction(e -> {
			answer = "Yes, Your Mom Gay.";
			window.close();
		});
		HBox layout = new HBox();
		layout.getChildren().addAll(btn01, btn02);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout,150,150);
		window.setScene(scene);
		window.show();
		return answer;
	}

}
