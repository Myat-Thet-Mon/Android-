package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise3atCap3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter salary and deduction");
        double salary=input.nextDouble();
        double deduction=input.nextDouble();
        double net=0;
        if(salary>deduction){
            System.out.println("OK");
            net=salary-deduction;
            System.out.println(net);
        }else{
            System.out.println("No way");
            net=salary-deduction;
            System.out.println(net);
        }
    }
}
