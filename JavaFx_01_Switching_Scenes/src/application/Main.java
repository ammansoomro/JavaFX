package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {

	Button btn1, btn2;
	Stage window;
	Scene scene01, scene02;
	StackPane layout01, layout02;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			window.setTitle("Fuck You Gay");

			btn1 = new Button("SexKrlo");
			btn2 = new Button("Nahi kr rha Vaapas jaa");

			btn1.setOnAction(e -> window.setScene(scene02));
			btn2.setOnAction(e -> window.setScene(scene01));

			layout01 = new StackPane();
			layout01.getChildren().add(btn1);

			layout02 = new StackPane();
			layout02.getChildren().add(btn2);

			scene01 = new Scene(layout01, 250, 250);
			scene02 = new Scene(layout02, 250, 250);
			window.setScene(scene01);
			window.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
