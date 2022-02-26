package ch6_SelfTest;

import java.util.Scanner;

class PetPair1 {
    private Pet first, second;

    public PetPair1(Pet firstPet, Pet secondPet) {
        first = firstPet;
        second = secondPet;
    }

//    public Pet getFirst() {
//        return first;
//    }

    public String getPetName() {
        return first.getName();
    }

    public int getPetAge() {
        return first.getAge();
    }

    public double getPetWeight() {
        return first.getWeight();
    }
    public void setFirstPetName(String newName){
        first.setName(newName);
    }
    public void setFirstPetAge(int newAge){
        first.setAge(newAge);
    }
    public void setFirstPetName(double newWeight){
        first.setWeight(newWeight);
    }

    public Pet getSecond() {
        return second;
    }

    public void writeOutput() {
        System.out.println("First pet in the pair:");
        first.writeOutput();
        System.out.println("\nSecond pet in the pair:");
        second.writeOutput();
    }


}

public class Exercise40 {
    public static void main(String[] args) {

        Pet goodDog = new Pet("Faithful Guard Dog", 5, 75.0);
        Pet buddy = new Pet("Loyal Companion", 4, 60.5);
        PetPair1 pair = new PetPair1(goodDog, buddy);
        System.out.println("Our pair:");
        pair.writeOutput();
        Pet badGuy = new Pet(goodDog.getName(),goodDog.getAge(), goodDog.getWeight());
        badGuy.setName("Dominion Spy");
        badGuy.setAge(1200);
        badGuy.setWeight(500);
        PetPair1 pair1 = new PetPair1(badGuy, buddy);
        System.out.println("\nOur pair now:");
        pair1.writeOutput();
        System.out.println("The pet wasn't so private!");
        System.out.println("Looks like a security breach.");


    }
}


