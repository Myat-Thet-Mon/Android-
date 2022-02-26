package ch5Project;

import ch5_SelfTest.SpeciesFirstTry;

import java.util.Scanner;

class SpeciesSecondTry {
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

    public double getDensity(double area) {
        double density = this.population / area;
        return density;
    }

    public int densityExceed1PerMiles() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter area");
        double area = input.nextDouble();
        int i = 1;
        while (true) {
            this.population = predictPopulation(i);
            if (getDensity(area) > 1) {
                return i;
            } else {
                i++;
            }
        }
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        SpeciesSecondTry obj = new SpeciesSecondTry();
        obj.readInput();
        System.out.println("Density of population exceed number per square miles after :" + obj.densityExceed1PerMiles());
    }
}
