package ie.gmit;

public class Calculator {

    //private int firstNum;
   // private int secondNum;

    public Calculator() {

    }

    public int add(int firstNum, int secondNum) {
        int finalNum = firstNum + secondNum;
        return finalNum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1, num2;
        num1 = 12;
        num2 = 13;
        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
    }
}
