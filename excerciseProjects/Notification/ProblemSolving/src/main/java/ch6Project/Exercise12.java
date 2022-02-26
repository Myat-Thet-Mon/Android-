package ch6Project;

class RationalNumbers {

    private int numerator;
    private int denominator;

    public RationalNumbers() {
        this.numerator = 0;
        this.numerator = 1;
    }

    public RationalNumbers(int a, int b) {
        this.numerator = a;
        this.denominator = b;
        simplify(a,b);
    }

    private void simplify(int x,int y) {
    this.numerator=this.numerator/getGCD(x,y);
    this.denominator=this.denominator/getGCD(x,y);
    }

    private static int getGCD(int x, int y) {
        int smallerNum = 0;
        int largestNum = 0;
        if (x > y) {
            smallerNum = x;
        } else {
            smallerNum = y;
        }
        for (int i = 1; i <= smallerNum; i++) {
            if (x % i == 0 && y % i == 0) {
                if (i > largestNum) {
                    largestNum = i;
                } else {
                    i = i;
                }
            }
        }
        return largestNum;
    }

    public double getValue() {
        return numerator / denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}

public class Exercise12 {
    public static void main(String[] args) {
        RationalNumbers rationalNumbers = new RationalNumbers(40, 12);
        System.out.println("Your input " + rationalNumbers.toString());
        System.out.println("Value is "+rationalNumbers.getValue());
    }
}
