package ch3Exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x and y and z");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println(x < 5 && y > x);
        System.out.println(x < 5 || y > x);
        System.out.println(x > 3 || y < 10 && z == 15);
        System.out.println(!(x > 3) && x != z || x + y == z);
    }
}
