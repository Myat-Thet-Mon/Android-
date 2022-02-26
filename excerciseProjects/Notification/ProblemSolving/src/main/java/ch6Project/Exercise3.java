package ch6Project;

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person() {
        this.name = null;
        this.age = 0;
    }

    public Person(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public Person(String newName) {
        this.name = newName;
    }

    public Person(int newAge) {
        this.age = newAge;
    }

    public boolean testTwoObjects(ch6Project.Person obj2) {
        if (this.equals(obj2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean testSameName(String name1) {
        if (this.name.equals(name1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean testSameAge(int age1) {
        if (this.age == age1) {
            return true;
        } else {
            return false;
        }
    }

    public void testGreaterThanOther(int age1) {
        if (this.age > age1) {
            System.out.println("First user is greater than second user");
        } else {
            System.out.println("First user is not greater than second user");
        }
    }

    public void testLessThanOther(int age1) {
        if (this.age < age1) {
            System.out.println("First user is less than second user");
        } else {
            System.out.println("First user is not less than second user");
        }
    }

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
}


public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first user name");
        String name1=input.next();
       // obj1.setName(input.next());
        System.out.println("Enter first user Age");
        int age1=input.nextInt();
        //obj1.setAge(input.nextInt());

        System.out.println("Enter second user name");
        String name2=input.next();
        System.out.println("Enter second user Age");
        int age2=input.nextInt();

        ch6Project.Person obj1 = new ch6Project.Person(name1,age1);
        ch6Project.Person obj2 = new ch6Project.Person(age2);


        System.out.println(obj1.testTwoObjects(obj2));
        System.out.println(obj1.testSameName(obj2.getName()));
        System.out.println(obj1.testSameAge(obj2.getAge()));
        obj1.testGreaterThanOther(obj2.getAge());
        obj1.testLessThanOther(obj2.getAge());
    }
}
