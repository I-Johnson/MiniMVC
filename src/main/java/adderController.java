
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class adderController {
	
	adderModel model;
	
	
	public void setModel(adderModel newModel) {
		model = newModel;
		
		StringConverter<Number> fmt = new NumberStringConverter(); 
		
		Bindings.bindBidirectional(adderValueLabel.textProperty(), model.getNumber(), fmt);
	}
	
	@FXML
	private Label adderValueLabel;
	
	@FXML
	void onClickAdd(ActionEvent event) {
		model.increment();
		
	}


}
