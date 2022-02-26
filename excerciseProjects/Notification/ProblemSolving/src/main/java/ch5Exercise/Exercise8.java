package ch5Exercise;

import java.util.Scanner;

public class Exercise8 {
    private String firstName;
    private String lastName;
    private String email;
    private String phNo;

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = input.next();
        System.out.println("Enter last name");
        String last = input.next();
        System.out.println("Enter  email");
        String email = input.next();
        System.out.println("Enter  phone number");
        String phNo = input.next();
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    public void changePhNo(String no) {
        this.phNo = no;
    }

    public void testSamePerson(String name, String email, String no) {
        String name1 = this.firstName +" "+ this.lastName;
        if (name1 == name) {
            if (this.email == email && this.phNo == no) {
                System.out.println("They are the same person");
            }
        } else {
            System.out.println("They are not the same");
        }
    }

    public static void main(String[] args) {
        Exercise8 obj = new Exercise8();
        obj.readInput();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new email");
        String email = input.next();
        obj.changeEmail(email);
        System.out.println("Enter new phone number");
        String no = input.next();
        obj.changePhNo(no);
        System.out.println("Enter name");
        String name = input.next();
        obj.testSamePerson(name, email, no);
    }
}
