package ch7_selfTest;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] a = new int[4][5];
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.println("Enter number");
                a[i][j]=input.nextInt();
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
