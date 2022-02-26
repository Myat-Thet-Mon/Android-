package ch5Project;

import java.util.Scanner;

class Calculate {
    private int result;

    public int addNumber(int num1) {
        return this.result + num1;
    }

    public int subtractNumber(int num1) {
        return this.result - num1;
    }

    public int multiplyNumber(int num1) {
        return this.result * num1;
    }

    public int divisionNumber(int num1) {
        return this.result / num1;
    }

    public void delete() {

    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        calculator.setResult(input.nextInt());
        System.out.println("Enter second number");
        System.out.println("Result of adding numbers :" + calculator.addNumber(input.nextInt()));
        System.out.println("Result of subtraction numbers :" + calculator.subtractNumber(5));
        System.out.println("Result of multiplying numbers :" + calculator.multiplyNumber(3));
        System.out.println("Result of division numbers :" + calculator.divisionNumber(6));

    }
}
