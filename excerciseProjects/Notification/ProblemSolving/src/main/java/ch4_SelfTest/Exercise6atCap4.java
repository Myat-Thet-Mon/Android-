package ch4_SelfTest;

import java.util.Scanner;

/*
System.out.print("Enter the population of the city: ");
int population = keyboard.nextInt( );
Write a while loop after these statements that ensures that population is
positive.If the user enter a population is either negative or zero .Ask
the user to enter a nonnegative value.
 */
public class Exercise6atCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter population ");
        int num=input.nextInt();
        while (num<=0){
            System.out.println("enter nonnegative value");
            num=input.nextInt();
            if(num>0){
                System.out.println(num);break;
            }

        }
    }
}