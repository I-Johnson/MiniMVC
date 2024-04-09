import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
public class TestMiniMVC{
	
	@Start
	private void start(Stage stage) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(adderModel.class.getResource("./myView.fxml"));
		try {
			Pane view = loader.load();
			adderController cont = loader.getController();
			cont.setModel(new adderModel());
			Scene s = new Scene(view);
			stage.setScene(s);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testButton(FxRobot robot) {
		try {
			Thread.sleep(1000);
			robot.clickOn("#addClicksButton");
			Thread.sleep(1000);
			robot.clickOn("#addClicksButton");
			Thread.sleep(1000);
			robot.clickOn("#addClicksButton");
			Thread.sleep(1000);
			robot.clickOn("#addClicksButton");
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}