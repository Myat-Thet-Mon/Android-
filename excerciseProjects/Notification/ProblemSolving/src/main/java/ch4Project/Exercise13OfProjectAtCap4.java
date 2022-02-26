package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise13OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter middle star");
        int num=input.nextInt();
        for (int i = 1; i <= num; i++) { // i = 1, 2, 3, 4, 5
            for (int j = 1; j <= i; j++) { // just print number of star per outer loop
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=num-1;i>=1;i--){ // i = 4, 3, 2, 1
            for (int j = 1; j <= i; j++) { // just print number of star per outer loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
