package ch5Exercise;

import java.util.Scanner;

public class Exercise5 {
   private int maxNum;
   private int minNum;
  // private String prompt;

    public int getValue(){
        this.maxNum=100;
        this.minNum=0;
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Enter value");
            int value=input.nextInt();
            if(value<minNum || value>maxNum){
                System.out.println("Error");
            }else{
                return value;
            }
        }
    }

    public static void main(String[] args) {
        Exercise5 obj=new Exercise5();
        System.out.println(obj.getValue());
    }
}
