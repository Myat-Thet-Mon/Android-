package ch7_selfTest;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         double[] value=new double[20];
         for(int i=0;i<value.length;i++){
             System.out.println("Enter value");
             value[i]=input.nextDouble();
         }
        System.out.println("The last 20th number is "+value[value.length-1]);

         for(int i=0;i<value.length;i++){
             double differ=value[i]-value[value.length-1];
             System.out.println(i+1+" differs from 20th number "+differ);
         }
    }
}
