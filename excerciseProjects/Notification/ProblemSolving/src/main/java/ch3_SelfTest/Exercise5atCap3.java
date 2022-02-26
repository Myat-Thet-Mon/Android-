package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise5atCap3 {

    public static void main(String[] args) {
        double minSalary=14.5;
        double minBonus=4.5;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter salary and bonus");
        double salary=input.nextDouble();
        double bonus=input.nextDouble();
        if(salary>=minSalary || bonus>=minBonus){
            System.out.println("OK");
        }else{
            System.out.println("Too Low");
        }
    }
}
