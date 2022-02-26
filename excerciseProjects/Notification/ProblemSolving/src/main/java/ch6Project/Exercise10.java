package ch6Project;

import java.util.Scanner;

class Temperature {
    private double degree;
    private String scale = "f";

    public Temperature() {
        this.degree = 0;
        this.scale = "c";
    }

    public Temperature(double newDegree) {
        this.degree = newDegree;
    }

    public Temperature(String newScale) {
        this.scale = newScale;
    }

    public Temperature(double newDegree, String newScale) {
        this.degree = newDegree;
        this.scale = newScale;
    }

    /**
     * if this method return zero,that mean your input is not celsius
     *
     * @return
     */
    public double getCelsius() {
        if (this.scale.equalsIgnoreCase("c")) {
            return this.degree;
        }else {
            return this.degree = (5 * (this.degree - 32)) / 9;
        }
    }

    /**
     * if this method return zero,that mean your input is not fahrenheit
     *
     * @return
     */
    public double getFahrenheit() {
        if (this.scale.equalsIgnoreCase("f")){
            return this.degree;
        }else{
            return this.degree = (9 * (this.degree) / 5) + 32;
        }
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setPerson(double degree, String scale) {
        this.degree = degree;
        this.scale = scale;
    }

    public boolean equalOrNot(Temperature otherTemperature) {
        if (this.degree == otherTemperature.degree) {
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThanOther(Temperature otherTemperature) {
        if (this.degree > otherTemperature.degree) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThanOther(Temperature otherTemperature) {
        if (this.degree < otherTemperature.degree) {
            return true;
        } else {
            return false;
        }
    }

}

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your degree");
        double degree = input.nextDouble();
        System.out.println("Enter your scale  c for celsius or f for fahrenheit");
        String scale = input.next();
        if (!scale.equals("c") && !scale.equals("f")) {
            System.out.println("Try again ! Please enter only c or f");
            System.exit(0);
        }
        Temperature first = new Temperature(degree, scale);
        Temperature second = new Temperature(1456);
        System.out.println("Changing temperature to celsius for first :" + first.getCelsius());
        System.out.println("Changing temperature to fahrenheit for first :" + first.getFahrenheit());
        System.out.println("Testing first is equal with second " + first.equalOrNot(second));
        System.out.println("Testing first is greater than second " + first.greaterThanOther(second));
        System.out.println("Testing first less than second " + first.lessThanOther(second));
    }
}
