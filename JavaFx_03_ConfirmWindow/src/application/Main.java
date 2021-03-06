package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {

	Stage Window;
	Button btn01;
	VBox layout;
	Label lbl01;
	Scene scene01;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Window = primaryStage;
			
			Window.setTitle("Gay Question");
			
			lbl01 = new Label("Your Mom Gay?");
			btn01 = new Button("Answer");
			btn01.setOnAction(e ->{
				String answer = ConfirmationWindow.Confirm();
				System.out.println(answer);
			} );
			layout = new VBox();
			layout.getChildren().addAll(lbl01,btn01);
			layout.setAlignment(Pos.CENTER);
			scene01 = new Scene(layout,250,250);
			Window.setScene(scene01);
			Window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
