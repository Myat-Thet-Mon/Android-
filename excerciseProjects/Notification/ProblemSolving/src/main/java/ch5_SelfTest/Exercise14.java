package ch5_SelfTest;

import java.util.Scanner;

public class Exercise14 {
    private String name;
    private int population;
    private double growthRate;

    /**
     * pre :change double value to int
     * post:change original population into new one
     */
    public void updatePopulation()
    {
        population = (int)(population + (growthRate / 100) *
                population);
    }


    public static void main(String[] args) {
        Exercise14 obj=new Exercise14();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter new name");
        String name=input.nextLine();
        System.out.println("Enter new population");
        int population=input.nextInt();
        System.out.println("Enter new growthRate");
        double rate=input.nextDouble();
        obj.name=name;
        obj.population=population;
        obj.growthRate=rate;
        obj.updatePopulation();
        System.out.println(obj.population);
    }
}
