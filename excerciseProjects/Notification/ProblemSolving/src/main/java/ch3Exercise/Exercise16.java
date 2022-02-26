package ch3Exercise;

import javax.swing.*;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature");
        int temp=input.nextInt();
        String variableLabel="Degree";
        System.out.println(temp+variableLabel);
    }
}
