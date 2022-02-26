package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise14OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial velocity of the ball:");
        int initialVelocity = input.nextInt();
        int height = 0;
        int j = 0;
        System.out.println("Time " + j + ":" + "Height :" + height);
        for (int i = 0; i < 5; i++) {
            height += initialVelocity - 32 * (i);

            if (height < 0) {
                height=height*((int)-0.5);
                initialVelocity=initialVelocity*((int)-0.5);
               height+= initialVelocity - 32 * (i);
            }
            j++;
            System.out.println("Time " + j + ":" + "Height :" + height);
        }

    }
}
