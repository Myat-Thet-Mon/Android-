package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter day ,month,year in the format of month / day /year");
        String dateInput=input.next();
        String format=dateInput.replace("/",".");
        System.out.println(format);
    }
}
