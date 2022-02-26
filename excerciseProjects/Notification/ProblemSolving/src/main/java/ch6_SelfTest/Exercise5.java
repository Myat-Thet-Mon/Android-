package ch6_SelfTest;

import java.util.Scanner;

class Pet2 {
    private String name;
    private int age;//in years
    private double weight;//in pounds

    public Pet2() { //default constructor
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public Pet2(String initialName, int initialAge, //constructor with parameters 1
                double initialWeight) {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void setPet2(String newName, int newAge,
                        double newWeight) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public Pet2(String initialName)//constructor with name parameter 2
    {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName) {
        name = newName; //age and weight are unchanged.
    }

    public Pet2(int initialAge) {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = initialAge;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge;
//name and weight are unchanged.
    }

    public Pet2(double initialWeight)//constructor with one parameter weight 3
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = initialWeight;
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight; //name and age are unchanged.
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        NewPet yourPet = new NewPet("Jane Doe");
        System.out.println("My records on your pet are inaccurate.");
        System.out.println("Here is what they currently say:");
        yourPet.writeOutput();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the correct pet name:");
        String correctName = keyboard.nextLine();
      //  yourPet.setName(correctName);
        System.out.println("Please enter the correct pet age:");
        int correctAge = keyboard.nextInt();
       // yourPet.setAge(correctAge);
        System.out.println("Please enter the correct pet weight:");
        double correctWeight = keyboard.nextDouble();
       // yourPet.setWeight(correctWeight);
        yourPet.setPet(correctName,correctAge,correctWeight);
        System.out.println("My updated records now say:");
        yourPet.writeOutput();
    }
}
