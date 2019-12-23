package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label result;
    private String operator = "";
    private CalculatorCore calculatorCore = new CalculatorCore();
    private long firstNumber = 0;
    private boolean start = true;

    @FXML
    public void ProcessNumbers(ActionEvent event)
    {
        if(start)
        {
            result.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML
    public void ProcessOperators(ActionEvent event)
    {
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")) {
            if (!operator.isEmpty())
                return;

            operator = value;
            firstNumber = Long.parseLong(result.getText());
            result.setText("");
        }else{
            if(operator.isEmpty())
                return;
            long secondNumber =  Long.parseLong(result.getText());
            float outPut = calculatorCore.Calculate(firstNumber,secondNumber,operator);
            result.setText(String.valueOf(outPut));
            operator = "";
            start = true;
        }
    }
}
