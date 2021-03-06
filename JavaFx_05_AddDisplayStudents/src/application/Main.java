package application;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Main extends Application {

	Stage Window;
	Button btn01, btn02, btn03;
	TextField f1, f2, name, rollno;
	Scene scene01, scene02;
	VBox layout01, layout02;
	ArrayList<String> names;
	ArrayList<String> rollnos;

	public static void main(String[] args) {
		launch(args); 
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Window = primaryStage;
			Window.setTitle("Title of Window");

			names = new ArrayList<>();
			rollnos = new ArrayList<>();

			f1 = new TextField("Username");
			f2 = new TextField("Password");
			f1.setAlignment(Pos.CENTER);
			f2.setAlignment(Pos.CENTER);

			btn01 = new Button("Click Me");
			btn01.setOnAction(e -> {
				if (f1.getText().matches(f2.getText())) {
					Window.setScene(scene02);
				} else {
					System.out.println("Invalid ID or Pass");
				}
			});

			layout01 = new VBox();
			layout01.getChildren().addAll(f1, f2, btn01);
			layout01.setAlignment(Pos.CENTER);
			scene01 = new Scene(layout01, 250, 250);
			name = new TextField("Name");
			rollno = new TextField("Roll No");
			name.setAlignment(Pos.CENTER);
			rollno.setAlignment(Pos.CENTER);

			btn02 = new Button("Add Student");
			btn02.setOnAction(e -> {
				names.add(name.getText());
				rollnos.add(rollno.getText());
				System.out.println("Added.");
			});

			btn03 = new Button("View Students");
			btn03.setOnAction(e->{
				System.out.println("Names: " + names);
				System.out.println("Roll No(s): " + rollnos);
			});
			
			
			layout02 = new VBox();
			layout02.getChildren().addAll(rollno, name, btn02, btn03);
			layout02.setAlignment(Pos.CENTER);
			scene02 = new Scene(layout02, 250, 250);

			Window.setScene(scene01);
			Window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
