package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise4atCap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and visibility");
        int speed = input.nextInt();
        int visibility = input.nextInt();
        if (speed == 25) {
            System.out.println("Caution");
        } else if (speed > 25 && visibility < 20) {
            System.exit(0);
        }
    }
}
