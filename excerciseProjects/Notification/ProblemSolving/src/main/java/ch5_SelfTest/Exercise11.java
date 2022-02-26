package ch5_SelfTest;

import java.util.Scanner;

public class Exercise11 {

    public String name;
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        this.name = keyboard.nextLine();
        System.out.println("What is the population of the " +
                "species?");
        this.population = keyboard.nextInt();
        System.out.println("Enter growth rate " +
                "(% increase per year):");
        this.growthRate = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public int predictPopulation(int years) {
        int result = 0;
        double populationAmount = this.population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount +
                    (this.growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    public int changePopulation(double area) {
        this.population = (int) area * 2;
        return this.population;
    }

    public static void main(String[] args) {
        Exercise11 second = new Exercise11();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter area");
        double area = input.nextDouble();
        System.out.println("Enter year");
        int year = input.nextInt();
        second.readInput();
        second.writeOutput();
        System.out.println(second.predictPopulation(year));
        System.out.println(second.changePopulation(area));
    }
}



