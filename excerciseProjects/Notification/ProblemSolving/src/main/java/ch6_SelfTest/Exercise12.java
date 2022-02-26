package ch6_SelfTest;

class DimensionConverter {
    public static final int INCHES_PER_FOOT = 12;

    public static double convertFeetToInches(double feet) {
        return feet * INCHES_PER_FOOT;
    }

    public static double convertInchesToFeet(double inches) {
        return inches / INCHES_PER_FOOT;
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        DimensionConverter dc = new DimensionConverter();
        double inches = dc.convertInchesToFeet(2.5);
        System.out.println("Inches :" + inches);
    }
}
