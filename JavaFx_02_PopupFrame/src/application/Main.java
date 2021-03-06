package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {

	Stage Window;
	Button btn01;
	Scene scene01;
	StackPane layout01;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Window = primaryStage;
			Window.setTitle("Title of Window");
			
			btn01 = new Button("Click Me");
			btn01.setOnAction(e -> PopupWindow.Display("Potty Lelo"));
			
			layout01 = new StackPane();
			layout01.getChildren().add(btn01);
			
			scene01 = new Scene(layout01,250,250);
			
			Window.setScene(scene01);
			Window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
