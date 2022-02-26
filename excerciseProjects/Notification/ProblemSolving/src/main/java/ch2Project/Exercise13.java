package ch2Project;/*
BMR

 */

import java.util.Scanner;


public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pound and height in inches and age in year");
        double pound = input.nextDouble();
        double inches = input.nextDouble();
        double year = input.nextDouble();
        double BMRFemale = 655 + (4.3 * pound) + (4.7 * inches) - (4.7 * year);
        double BMRMale = 66 + (6.3 * pound) + (12.9 * inches) - (6.8 * year);
        double choFemale = BMRFemale / 230;
        double choMale = BMRMale / 230;
        System.out.println("Chocolate bars that can eat by female " + BMRFemale);
        System.out.println("Chocolate bars that can eat by Male " + BMRMale);
    }
}
