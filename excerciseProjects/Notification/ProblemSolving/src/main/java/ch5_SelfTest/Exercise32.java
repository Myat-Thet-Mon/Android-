package ch5_SelfTest;

import java.util.Scanner;

//Equals method
public class Exercise32 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equalOrNot(Exercise32 newOne) {

        if (this.name.equals(newOne.getName()) && this.age == newOne.getAge()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Exercise32 p = new Exercise32();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        p.name = input.nextLine();
        System.out.println("Enter age");
        p.age = input.nextInt();

        Exercise32 newOne = new Exercise32();
        newOne.setName("John");
        newOne.setAge(10);
        System.out.println(p.equalOrNot(newOne));
    }
}
