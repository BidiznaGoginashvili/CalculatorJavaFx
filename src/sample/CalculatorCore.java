package sample;

public class CalculatorCore {

    public float Calculate(long firstNumber, long secondNumber, String operator)
    {
        switch (operator)
        {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return secondNumber == 0 ? 0 : firstNumber / secondNumber;
            default:
                return 0;
        }
    }
}
