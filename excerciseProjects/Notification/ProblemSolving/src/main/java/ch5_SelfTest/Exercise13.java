package ch5_SelfTest;

import java.util.Scanner;

//We cannot use because data are private

public class Exercise13 {
    private String name;
    private int population;
    private double growthRate;

    public void setSpecies(String newName, int newPopulation,
                           double newGrowthRate)
    {
        this.name = newName;
        if (newPopulation >= 0)
            this.population = newPopulation;
        else
        {
            System.out.println(
                    "ERROR: using a negative population.");
            System.exit(0);
        }
        this.growthRate = newGrowthRate;
    }
    public void writeOutput(){
        System.out.println("Name "+this.name);
        System.out.println("Population "+this.population);
        System.out.println("GrowthRate "+this.growthRate);

    }

    public static void main(String[] args) {
        Exercise13 obj=new Exercise13();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter new name");
        String name=input.nextLine();
        System.out.println("Enter new population");
        int population=input.nextInt();
        System.out.println("Enter new growthRate");
        double rate=input.nextDouble();
        obj.setSpecies(name,population,rate);
        obj.name = "Klingon ox";
        obj.population = 10;
        obj.growthRate = 15;
        obj.writeOutput();
    }
}