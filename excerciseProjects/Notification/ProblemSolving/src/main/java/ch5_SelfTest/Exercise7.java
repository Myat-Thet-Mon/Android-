package ch5_SelfTest;

import java.util.Scanner;

public class Exercise7 {
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
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public int getPopulation() {
        int result = 0;
        double populationAmount = this.population;
        int count = 10;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = populationAmount +
                    (this.growthRate / 100) *
                            populationAmount;
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    public static void main(String[] args) {
        SpeciesFirstTryPopulation4 p = new SpeciesFirstTryPopulation4();
        p.readInput();
        p.writeOutput();
        int population = p.getPopulation();
        System.out.println("Population after ten years "+population);
    }
}
