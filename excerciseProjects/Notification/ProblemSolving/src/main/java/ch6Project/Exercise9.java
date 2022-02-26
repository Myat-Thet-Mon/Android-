package ch6Project;

import java.util.Scanner;

class Person1 {
    private String name;
    private int age;

    public Person1() {
        this.name = "No name yet";
        this.age = 0;
    }

    public Person1(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String first, String last) {
        // string fullName = "Adrian Rules";
        var names = this.name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        firstName = first;
        lastName = last;
        String newName = firstName + " " + lastName;
        this.name = newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person1 createToddler() {
        Person1 tmp = new Person1();
        tmp.setName("A toddler");
        tmp.setAge(2);
        return tmp;
    }

    public static Person1 createPreschooler() {
        Person1 tmp = new Person1();
        tmp.setName("A preschooler");
        tmp.setAge(5);
        return tmp;
    }

    public static Person1 createAdolescent() {
        Person1 tmp = new Person1();
        tmp.setName("A adolescent");
        tmp.setAge(9);
        return tmp;
    }

    public static Person1 createTeenager() {
        Person1 tmp = new Person1();
        tmp.setName("A teenager");
        tmp.setAge(15);
        return tmp;
    }

    public static Person1 createAdult() {
        Person1 tmp = new Person1();
        tmp.setName("An adult");
        tmp.setAge(21);
        return tmp;
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your age");
        int age=input.nextInt();
        Person1 person1 = new Person1(name,age);
        //person1.setName("Jue Jue");
        person1.setName("Myat", "Thet");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.createAdult();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}
