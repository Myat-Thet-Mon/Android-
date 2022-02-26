package ch4_SelfTest;

import java.util.Scanner;

/*
Scanner keyboard = new Scanner(System.in);
int number;
do
{
System.out.println("Enter a whole number:");
number = keyboard.nextInt();
System.out.println("You entered " + number);
} while (number > 0);
System.out.println("number after loop = " + number);
 */
public class Exercise4atCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         int num=1;
        while (num>0){
            System.out.println("enter number");
            num=input.nextInt();
            System.out.println("You entered " + num);
        }
        System.out.println("number after loop = " + num);

    }
}
