package ch5_SelfTest;
//4

import java.util.Scanner;

public class SpeciesFirstTryPopulation4 {
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
        double populationAmount = population;
        int count = 10;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = populationAmount +
                    (growthRate / 100) *
                            populationAmount;
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    public int getFemalePopulation() {
        int countF = getPopulation()/2+1;
        return countF;
    }

    public int getMalePopulation() {
        int countM = getPopulation()/2;
        return countM;
    }

    public static void main(String[] args) {
        SpeciesFirstTryPopulation4 p = new SpeciesFirstTryPopulation4();
        p.readInput();
        p.writeOutput();
        System.out.println("Population after 10years :" + p.getPopulation() + " And Female population is:"
                + p.getFemalePopulation() + " Male population is :" + p.getMalePopulation());

    }
}