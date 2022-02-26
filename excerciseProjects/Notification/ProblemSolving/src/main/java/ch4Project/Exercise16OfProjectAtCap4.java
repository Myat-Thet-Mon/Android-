package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise16OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        int n = input.nextInt();
        int newChoco = 0;

        do {
            int chocoBar = n;
            int coupon = n;
            int extraChoco = chocoBar / 6;
            do {
                extraChoco += chocoBar / 6;
            } while (extraChoco >= 6);
            newChoco = chocoBar + extraChoco;
            System.out.println("We can eat :" + newChoco);

        } while (newChoco >= 6);
    }
}
