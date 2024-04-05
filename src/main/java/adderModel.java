

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class adderModel {

	IntegerProperty number = new SimpleIntegerProperty();
	
	
	public adderModel()
	{
		this.number.setValue(0);;
	}

	public IntegerProperty getNumber() {
		return number;
	}

	public void increment() {
		this.number.set(number.get()+1);
	}
	
}
