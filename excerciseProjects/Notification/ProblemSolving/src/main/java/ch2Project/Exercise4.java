package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter four digit number");
        int num=input.nextInt();
        int a=num/1000;
        num=num%1000;
        int b=num/100;
        num=num%100;
        int c=num/10;
        int d=num%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
