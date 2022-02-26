package ch6Project;

import ch5_SelfTest.Species27;

import java.util.Scanner;

class Species {
    private String name;
    private int population;
    private double growthRate;

    public Species() {
        this.name = null;
        this.population = 0;
        this.growthRate = 0;
    }

    public Species(String newName) {
        this.name = newName;
    }

    public Species(int newPopulation) {
        if (population >= 0)
            this.population = newPopulation;
        else {
            System.out.println("ERROR: using a negative " +
                    "population.");
            System.exit(0);
        }
    }

    public Species(double newGrowRate) {
        this.growthRate = newGrowRate;
    }

    public Species(String newName, int newPopulation, double newGrowRate) {
        this.name = newName;
        if (population >= 0)
            this.population = newPopulation;
        else {
            System.out.println("ERROR: using a negative " +
                    "population.");
            System.exit(0);
        }
        this.growthRate = newGrowRate;
    }
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine();
        System.out.println(
                "What is the population of the species?");
        population = keyboard.nextInt();
        while (population < 0) {
            System.out.println("Population cannot be negative.");
            System.out.println("Reenter population:");
            population = keyboard.nextInt();
        }
        System.out.println(
                "Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    /**
     * Precondition: years is a nonnegative number.
     * Returns the projected population of the receiving object
     * after the specified number of years.
     */
    public int predictPopulation(int years) {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount +
                    (growthRate / 100) *
                            populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }
    public boolean equals(ch6Project.Species otherObject) {
        return (name.equalsIgnoreCase(otherObject.name)) &&
                (population == otherObject.population) &&
                (growthRate == otherObject.growthRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population >= 0)
            this.population = population;
        else {
            System.out.println("ERROR: using a negative " +
                    "population.");
            System.exit(0);
        }
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setSpecies(String newName, int newPopulation,
                           double newGrowthRate) {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else {
            System.out.println("ERROR: using a negative " +
                    "population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }

}

public class Exercise2 {
    public static void main(String[] args) {

        Species testSpecies = new Species("Tribbles", 100, 50);
// Test the setSpecies method

        if (testSpecies.getName().equals("Tribbles") &&
                (testSpecies.getPopulation() == 100) &&
                (testSpecies.getGrowthRate() >= 49.99) &&
                (testSpecies.getGrowthRate() <= 50.01)) {
            System.out.println("Pass: setSpecies test.");
        } else {
            System.out.println("FAIL: setSpecies test.");
        }
// Test the predictPopulation method
        if ((testSpecies.predictPopulation(-1) == 100) &&
                (testSpecies.predictPopulation(1) == 150) &&
                (testSpecies.predictPopulation(5) == 759)) {
            System.out.println("Pass: predictPopulation test.");
        } else {
            System.out.println("FAIL: predictPopulation test.");
        }
    }
}
