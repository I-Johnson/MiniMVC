import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		adderModel model = new adderModel();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("myView.fxml"));
		BorderPane view = loader.load();
		adderController cont = loader.getController();
		
		cont.setModel(model);
				
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
		

	}
	
	public static void main(String [] args) 
	{
		launch(args);
	}

}
