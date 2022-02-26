package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise15OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        do {
            result1 = (int) (Math.random() * num) + 1;
            result2 = (int) (Math.random() * num) + 1;
            result3 = (int) (Math.random() * num) + 1;
        } while (result1 == result2 || result2 == result3 || result3 == result1 );
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

