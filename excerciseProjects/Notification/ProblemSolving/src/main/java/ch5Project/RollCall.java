package ch5Project;

import java.util.Scanner;

class StudentRollCall{
    private String name;
    private int id;
    private String address;
    private int phNo;
    private int absent;

    public void readInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        this.name=input.nextLine();
        System.out.println("Enter address");
        this.address=input.nextLine();
        System.out.println("Enter phone no");
        this.phNo=input.nextInt();
    }
    public void countAbsentDay(){
        this.absent++;
    }
    public void output() {
        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.name);
        System.out.println("Address :" + this.address);
        System.out.println("Phone No :" + this.phNo);
        System.out.println("AbsentDay :" + this.absent);
    }
}
public class RollCall {
    public static void main(String[] args) {
        StudentRollCall studentRollCall=new StudentRollCall();
        studentRollCall.readInput();
        studentRollCall.countAbsentDay();


        studentRollCall.countAbsentDay();
        studentRollCall.output();

    }
}
