package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	Stage Window;
	Button btn01;
	Scene scene01;
	VBox layout01;
	ComboBox<String> comboBox; 
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Window = primaryStage;
			Window.setTitle("Title of Window");
			
			comboBox = new ComboBox<String>();
			comboBox.getItems().addAll("Amman","Naba");
			btn01 = new Button("Click Me");
			btn01.setOnAction(e -> System.out.println(comboBox.getValue()));
			comboBox.setPromptText("Gay People");
			
			layout01 = new VBox();
			layout01.getChildren().addAll(comboBox,btn01);
			layout01.setAlignment(Pos.CENTER);
			scene01 = new Scene(layout01,250,250);
			
			Window.setScene(scene01);
			Window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
