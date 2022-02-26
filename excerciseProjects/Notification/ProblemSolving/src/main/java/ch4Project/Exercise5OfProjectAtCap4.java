package ch4Project;

import java.util.Scanner;

/*
smallest
 */
public class Exercise5OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        int count=0;
        int largest=0;
        int smallest=Integer.MAX_VALUE;
        int sum=0;
        double average=0;
        while(true) {
            System.out.println("enter num");
            num = input.nextInt();
            if (num<0) {
                break;
            }
            if(num>largest){
                largest=num;
            }
            if (num <smallest) {
               smallest=num;
           }
            count++;
            sum =sum+num;
        }
        System.out.println("Largest number "+largest);
        System.out.println("Smallest number "+smallest);
         average=sum/count;
         System.out.println("Average "+average);
    }
}
