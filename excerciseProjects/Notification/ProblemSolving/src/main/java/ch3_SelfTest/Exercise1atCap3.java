package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise1atCap3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int goal=input.nextInt();
        if(goal>10){
            System.out.println("Wow");
        }
        else if(goal<=10){
            System.out.println("oh well");
        }
    }
}
