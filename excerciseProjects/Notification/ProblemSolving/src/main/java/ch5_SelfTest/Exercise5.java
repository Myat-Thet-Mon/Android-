package ch5_SelfTest;

import java.util.Scanner;

//5
public class Exercise5 {
    public String name;
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine();
        System.out.println("What is the population of the " +
                "species?");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate " +
                "(% increase per year):");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name = " + this.name);
        System.out.println("Population = " + this.population);
        System.out.println("Growth rate = " + this.growthRate + "%");
    }

    public static void main(String[] args) {
        Exercise5 object = new Exercise5();
        object.readInput();
        object.writeOutput();
    }
}
