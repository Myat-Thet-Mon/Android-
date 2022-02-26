package ch2Exercise;

import java.util.Scanner;

/*

 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter u");
        int u = input.nextInt();
        System.out.println("Enter v");
        int v = input.nextInt();
        System.out.println("Enter w");
        int w= input.nextInt();
        System.out.println("Enter x");
        int x= input.nextInt();
        System.out.println("Enter y");
        int y= input.nextInt();

        int ans1 = u * v * w * x;
        int ans2 = u * y % v * w * x;
        int ans3 = u++ / v + u++ * w;
        System.out.println("Ans1 " + ans1);
        System.out.println("Ans2 " + ans2);
        System.out.println("Ans3 " + ans3);

    }
}
