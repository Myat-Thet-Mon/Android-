package ch7_selfTest;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size");
        double[]a=new double[input.nextInt()];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter data");
            a[i]=input.nextDouble();
            System.out.println("Do you want to continue or not");
            String ans=input.next();
            if(ans.equals("not")){
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i]==0){
                continue;
            }
            System.out.println("Your data is "+a[i]);
        }
    }
}
