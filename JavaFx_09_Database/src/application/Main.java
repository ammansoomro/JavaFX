package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Main extends Application {
	Stage Window;
	Button add;
	TextField id, name;
	Scene scene01;
	VBox layout;
	Scanner scan = null;
	int sno = 0;
	String sname = null, sadd = null;
	String query = null;
	Statement st = null;
	int count = 0;
	Connection con = null;

	public static void main(String[] args) {
		launch(args);
	}

	public void AddStudent() throws SQLException {
		sno = Integer.parseInt(id.getText());
		sname = name.getText();
		query = "INSERT INTO STUDENTS VALUES (" + sno + ", " + "\'" + sname + "\') ";
		if (con != null) {
			st = con.createStatement();
		}
		if (st != null) {
			count = st.executeUpdate(query);
		}
		System.out.println(count + " record inserted.");
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// variables for connection
			final String url = "jdbc:mysql://localhost:3306/javafxstudents";
			final String user = "root";
			final String password = "DarkRealm007";
			con = DriverManager.getConnection(url, user, password);

			Window = primaryStage;
			Window.setTitle("Database Connected Shit");
			add = new Button("Add");
			add.setOnAction(e -> {
				try {
					AddStudent();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			id = new TextField("ID");
			name = new TextField("Name");

			layout = new VBox();
			layout.setAlignment(Pos.CENTER);
			layout.getChildren().addAll(id, name, add);

			scene01 = new Scene(layout, 200, 200);

			Window.setScene(scene01);
			Window.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
