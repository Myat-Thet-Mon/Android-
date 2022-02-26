package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise11OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user input
        System.out.println("Enter weight in pound and height in inches and age in year");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double age = input.nextDouble();
        System.out.println("Enter F for female or M for male");
        String gender = input.next();
        System.out.println("a or b or c or d");
        String typeOfPerson = input.next();
        //variable declaration
        double BMR = 0;
        double increasedRate = 0;
        double numberOfChocoBars = 0;

        if (gender.equals("F")) {
            BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        } else if (gender.equals("M")) {
            BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        }

        switch (typeOfPerson) {
            case "a":
                increasedRate = 20;
                break;
            case "b":
                increasedRate = 30;
                break;
            case "c":
                increasedRate = 40;
                break;
            case "d":
                increasedRate = 50;
                break;
        }

        BMR = BMR + (BMR * increasedRate / 100);
        numberOfChocoBars = BMR / 230;

        System.out.println("Numbers of Chocolate bars  " + numberOfChocoBars);

    }
}
