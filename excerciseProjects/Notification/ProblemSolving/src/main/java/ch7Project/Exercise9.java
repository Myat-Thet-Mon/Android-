package ch7Project;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password with five digit number");
        String password = input.next();
        if (password.length() > 5) {
            System.out.println("Enter valid password ");
            System.exit(0);
        }
        int[] array = new int[10];


//        for (int i=0;i<10;i++){
//            array[i]=(int) Math.random()*(10-1)+1 ;
//            System.out.println("A "+array[i]);
//           // System.out.print(i+" ");
//        }
        System.out.print("PIN : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (9 - 0)) + 0;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("NUM : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Enter your password with generated code");
        String code = input.next();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (array[Character.getNumericValue(password.charAt(i))] ==Character.getNumericValue(code.charAt(i))) {
                count++;
            }

        }
        if (count == 5) {
            System.out.println("Your password is corrected");
        } else {
            System.out.println("Your password is wrong !Plz enter valid password again");
        }
    }
}
