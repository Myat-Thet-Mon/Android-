package ch4Exercise;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean result=true;
        while (result==true){
            System.out.println("Enter volume");
            double v=input.nextDouble();
            System.out.println("Enter radius");
            double r=input.nextDouble();
            double h=v/(3.14*r*r);
            System.out.println("Height of cylinder "+h);
            double c=2*3.14*r*(r+h);
            System.out.println("cost for a cylinder "+c);
        }
    }
}
