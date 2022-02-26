package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise11atCap3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int num=input.nextInt();
        if(num>10){
            System.out.println("High");
        }else if(num<5){
            System.out.println("Low");
        }
    }
}
