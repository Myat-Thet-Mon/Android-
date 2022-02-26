package ch4_SelfTest;

import java.util.Scanner;

/*
Write a Java loop that will read a list of numbers of type double and then
display their average. The numbers are all greater than or equal to 1.0. The
input data ends with a sentinel value, which you must specify. Also give
any declarations or initializing statements that are needed.
 */
public class Exercise16atCap4 {
    public static void main(String[] args) {
        double num=0;
        int count=0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        while(num+1>=1){
            System.out.println("enter number");
            num=input.nextInt();
            if(num<0){
                break;
            }
           sum=sum+num;
           count++;
        }
        double average=sum/count;
        System.out.println("Average "+average);
    }
}
