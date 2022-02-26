package ch2Exercise;

import java.util.Scanner;

/*

 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x");
        double x=input.nextDouble();
        double y=x%2.0;
        System.out.println("X "+x);
        System.out.println("Y "+y);
        int z=(int)x;
        System.out.println("Before type cast "+x);
        System.out.println("after type cast z "+z);
        System.out.println("z%2 is "+z%2);
    }
}
