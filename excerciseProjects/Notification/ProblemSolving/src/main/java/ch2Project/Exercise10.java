package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter price of item\n" +
                "(from 25 cents to a dollar, in 5-cent increments):");
        int userInput=100-input.nextInt();
        System.out.println("You bought an item for "+userInput+ "cents and gave me a dollar,\n" +
                "so your change is");
        int quarter=userInput/25;
        userInput=userInput%25;
        int dime=userInput/10;
        userInput=userInput%10;
        int nickle=userInput/5;
        System.out.println(quarter+" quarters");
        System.out.println(dime+" dimes and");
        System.out.println(nickle+" nickles");
    }
}
