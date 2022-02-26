package ch5_SelfTest;

import java.util.Scanner;
//Exercise4
public class SpeciesFirstTry3 {
    private int number;
    private String name;
    private int population;
    private double growthRate;

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
        number++;
    }

    public void writeOutput() {
        System.out.println("Number = " + number);
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }
    public int getPopulationIn10() {
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


    public static void main(String[] args) {
        SpeciesFirstTry3 speciesOfTheMonth = new SpeciesFirstTry3();
        System.out.println("Enter data on the Species of " +
                "the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();
        int futurePopulation =
                speciesOfTheMonth.getPopulationIn10();
        System.out.println("In ten years the population will be "
                + futurePopulation);
    }
}
