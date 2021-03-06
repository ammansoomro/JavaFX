package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Main extends Application {

	Stage Window;
	Button btn01;
	TextField f1,f2;
	Scene scene01;
	VBox layout01;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Window = primaryStage;
			Window.setTitle("Title of Window");
			
			f1 = new TextField("Username");
			f2 = new TextField("Password");
			f1.setAlignment(Pos.CENTER);
			f2.setAlignment(Pos.CENTER);
			btn01 = new Button("Click Me");
			btn01.setOnAction(e->{
				if(f1.getText().matches(f2.getText()))
				{
					System.out.println("Welcome Bitch");
				}
			});
			
			layout01 = new VBox();
			layout01.getChildren().addAll(f1,f2,btn01);
			layout01.setAlignment(Pos.CENTER);
			scene01 = new Scene(layout01,250,250);
			
			Window.setScene(scene01);
			Window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
