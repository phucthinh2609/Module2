package Bai8_CleanCode.calculator;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, int operator){
        switch (operator){
            case ADDITION:
                return firstOperand+secondOperand;
            case SUBTRACTION:
                return firstOperand-secondOperand;
            case MULTIPLICATION:
                return firstOperand*secondOperand;
            case DIVISION:
                if(secondOperand!=0)
                    return firstOperand/secondOperand;
                else
                    throw new RuntimeException("Can not dive by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}