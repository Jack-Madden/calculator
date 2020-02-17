package ie.gmit;

public class Calculator {

    private int firstNum;
    private int secondNum;

    public Calculator() {
        this.firstNum = 2;
        this.secondNum = 2;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
    }
}
