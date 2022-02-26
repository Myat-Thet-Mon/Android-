package ch7_selfTest;

import java.util.Scanner;

public class Exercise7 {
    public void readInput()
    {
        System.out.print("Enter name of sales associate: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.print("Enter associate's sales: $");
        double sales = keyboard.nextDouble();
    }
    public static void main(String[] args) {
        SalesAssociate[] entry=new SalesAssociate[3];
       for (int i=0;i<3;i++){
           entry[i].readInput();
       }
    }

}
