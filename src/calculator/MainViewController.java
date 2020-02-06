package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController {

	@FXML private TextField textFieldDisplay;
	@FXML private Button acButton;
	@FXML private Button plusMinusButton;
	@FXML private Button percentButton;
	@FXML private Button divideButton;
	@FXML private Button multiplyButton;
	@FXML private Button substractButton;
	@FXML private Button plusButton;
	@FXML private Button equalButton;
	@FXML private Button dotButton;
	@FXML private Button Button0;
	@FXML private Button Button1;
	@FXML private Button Button2;
	@FXML private Button Button3;
	@FXML private Button Button4;
	@FXML private Button Button5;
	@FXML private Button Button6;
	@FXML private Button Button7;
	@FXML private Button Button8;
	@FXML private Button Button9;

	String value1 = "";
	String value2 = "";
	String operator = "";	

public void btnZeroAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "0");
}	
	
public void btnOneAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "1");
}	
	
public void btnTwoAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "2");
}	
	
public void btnThreeAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "3");
}	

public void btnFourAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "4");
}	
	
public void btnFiveAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "5");
}

public void btnSixAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "6");
}

public void btnSevenAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "7");
}

public void btnEightAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "8");
}

public void btnNineAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + "9");
}

public void btnAcAction() {
	textFieldDisplay.clear();
}

public void btnPlusMinusAction() {
	operator = "plusminus";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText(String.valueOf(Double.parseDouble(value1)*(-1)));
}

public void btnPercentAction() {
	operator = "percent";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText(String.valueOf(Double.parseDouble(value1)*(0.01)));
}

public void btnDivideAction() {
	operator = "divide";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText("");
}

public void btnMultiplyAction() {
	operator = "multiply";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText("");
}

public void btnSubstractAction() {
	operator = "minus";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText("");
}

public void btnPlusAction() {
	operator = "plus";
	value1 = textFieldDisplay.getText();
	textFieldDisplay.setText("");
}

public void btnEqualAction() {
	value2 = textFieldDisplay.getText();
	textFieldDisplay.setText("");
	calculation();
}

public void btnDotAction() {
	textFieldDisplay.setText(textFieldDisplay.getText() + ".");
}


public void calculation() {
	
	double Number1 = Double.valueOf(value1);
	double Number2 = Double.valueOf(value2);
	double result = 0.0;
	switch (operator) {
	
		case "plus":
			result = Number1 + Number2;
			break;
		
		case "minus":
			result = Number1 - Number2;
			break;
			
		case "multiply":
			result = Number1 * Number2;
			break;
			
		case "divide":
			result = Number1 / Number2;
			break;

	}
	textFieldDisplay.setText(String.valueOf(result));
	
}


}