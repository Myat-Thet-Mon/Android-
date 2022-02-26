package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise9OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String dateString = input.next();
        //invalid date string
        if (dateString.length() != 10 || dateString.charAt(2) != '/' || dateString.charAt(5) != '/') {
            System.out.println("Invalid Date String");
            return;
        }

        int months = Integer.parseInt(dateString.substring(0, 2));
        int days = Integer.parseInt(dateString.substring(3, 5));
        int years = Integer.parseInt(dateString.substring(6));
        boolean isLeapYear = (years % 4 == 0 && years % 100 != 0) || years % 400 == 0;

        //validate month
        if (months < 1 || months > 12) {
            System.out.println("Invalid month");
            return;
        }

        int maxDate = 31;
        switch (months) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDate = 30;
                break;
            case 2:
                maxDate = isLeapYear? 29 : 28;
                break;
            default: maxDate = 31;
        }

        //validate date
        if (days < 1 || days > maxDate) {
            System.out.println("Invalid Days");
            return;
        }

        System.out.println("It is a valid date");

    }


}
