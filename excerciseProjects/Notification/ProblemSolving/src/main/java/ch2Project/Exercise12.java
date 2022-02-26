package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius with inches");
        double radius = input.nextDouble();
        radius=1*(radius/12);
        System.out.println("Enter height with feet");
        double height = input.nextDouble();
        double cylinderVolume = 3.14 * radius * radius * height;
        cylinderVolume = cylinderVolume * 7.49;
        System.out.println("the number of gallons stored in the well " + cylinderVolume);


    }
}
