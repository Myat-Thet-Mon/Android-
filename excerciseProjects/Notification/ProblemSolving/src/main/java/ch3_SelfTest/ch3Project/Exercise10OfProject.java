package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise10OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pound and inches and year");
        double pound = input.nextDouble();
        double inches = input.nextDouble();
        double year = input.nextDouble();


        System.out.println("Enter F or M");
        String ans = input.next();
        if (ans.equalsIgnoreCase("F")) {
            double BMRFemale = 655 + (4.3 * pound) + (4.7 * inches) - (4.7 * year);
            double chocoFemale = BMRFemale / 230;
            System.out.println("The number of choco bars for given female " + chocoFemale);

        } else if(ans.equalsIgnoreCase("M")){
            double BMRMale = 66 + (6.3 * pound) + (12.9 * inches) - (6.8 * year);
            double chocoMale = BMRMale / 230;
            System.out.println("Male " + chocoMale);
        }

    }
}
