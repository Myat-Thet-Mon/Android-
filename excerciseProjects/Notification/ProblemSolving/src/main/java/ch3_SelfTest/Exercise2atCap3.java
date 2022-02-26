package ch3_SelfTest;

import java.util.Scanner;

/*

 */
public class Exercise2atCap3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter goal and error");
        int goal=input.nextInt();
        int error= input.nextInt();
        if(goal>10 && error==0){
            System.out.println("Wow");
        }else{
            System.out.println("oh well");
        }
    }
}
