package ie.gmit;

public class Calculator {

    public Calculator() {
    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
    }
}
