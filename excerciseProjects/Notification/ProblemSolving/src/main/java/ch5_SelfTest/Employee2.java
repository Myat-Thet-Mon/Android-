package ch5_SelfTest;

import java.util.Scanner;

//2
public class Employee2 {
    String name;

    public void readInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter name");
        this.name=input.next();
    }

    public static void main(String[] args) {
        Employee2 dilbert = new Employee2();
        dilbert.readInput();
    }
}
