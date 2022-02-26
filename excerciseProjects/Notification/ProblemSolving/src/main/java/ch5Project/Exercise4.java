package ch5Project;

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public boolean testTwoObjects(Person obj2) {
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
        if (this.age< age1) {
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

public class Exercise4{
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first user name");
        obj1.setName(input.next());
        System.out.println("Enter first user Age");
        obj1.setAge(input.nextInt());

        System.out.println("Enter second user name");
        obj2.setName(input.next());
        System.out.println("Enter second user Age");
        obj2.setAge(input.nextInt());

        System.out.println(obj1.testTwoObjects(obj2));
        System.out.println(obj1.testSameName(obj2.getName()));
        System.out.println(obj1.testSameAge(obj2.getAge()));
        obj1.testGreaterThanOther(obj2.getAge());
        obj1.testLessThanOther(obj2.getAge());
    }
}


