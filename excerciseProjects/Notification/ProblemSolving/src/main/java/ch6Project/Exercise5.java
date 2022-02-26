package ch6Project;

import java.util.Scanner;

class Pet{
    private String name;
    private int age;//in years
    private double weight;//in pounds

    public Pet(){
        name = "No name yet.";
        age = 0;
        weight = 0;
    }
    public Pet(String newName,int age,double weight){
        this.name=newName;
        this.age=age;
        this.weight=weight;
    }

    public void readDataOfPet(Pet dataOfPet){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter pet name");
        dataOfPet.name=input.next();
        System.out.println("Enter pet age");
        dataOfPet.age=input.nextInt();

    }

    public static String smallestPet(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
        if(pet1.weight<pet2.weight && pet1.weight<pet3.weight && pet1.weight<pet4.weight
           && pet1.weight<pet5.weight ) {
            return pet1.name;
        }else if(pet2.weight<pet1.weight && pet2.weight<pet3.weight &&
                pet2.weight<pet4.weight && pet2.weight<pet5.weight ){
            return pet2.name;

        }else if(pet3.weight<pet1.weight && pet3.weight<pet2.weight &&
                pet3.weight<pet4.weight && pet3.weight<pet5.weight ){
            return pet3.name;
        }else if(pet4.weight<pet1.weight && pet4.weight<pet2.weight &&
                pet4.weight<pet3.weight && pet4.weight<pet5.weight ){
            return pet4.name;
        }else{
            return pet5.name;
        }
    }
    public static String largestPet(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
        if(pet1.weight>pet2.weight && pet1.weight>pet3.weight && pet1.weight>pet4.weight
                && pet1.weight>pet5.weight ) {
            return pet1.name;
        }else if(pet2.weight>pet1.weight && pet2.weight>pet3.weight &&
                pet2.weight>pet4.weight && pet2.weight>pet5.weight ){
            return pet2.name;

        }else if(pet3.weight>pet1.weight && pet3.weight>pet2.weight &&
                pet3.weight>pet4.weight && pet3.weight>pet5.weight ){
            return pet3.name;
        }else if(pet4.weight>pet1.weight && pet4.weight>pet2.weight &&
                pet4.weight>pet3.weight && pet4.weight>pet5.weight ){
            return pet4.name;
        }else{
            return pet5.name;
        }
    }

    public static String youngestPet(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
        if(pet1.age<pet2.age && pet1.age<pet3.age && pet1.age<pet4.age
                && pet1.age<pet5.age ) {
            return pet1.name;
        }else if(pet2.age<pet1.age && pet2.age<pet3.age &&
                pet2.age<pet4.age && pet2.age<pet5.age ){
            return pet2.name;

        }else if(pet3.age<pet1.age && pet3.age<pet2.age &&
                pet3.age<pet4.age && pet3.age<pet5.age ){
            return pet3.name;
        }else if(pet4.age<pet1.age && pet4.age<pet2.age &&
                pet4.age<pet3.age && pet4.age<pet5.age ){
            return pet4.name;
        }else{
            return pet5.name;
        }
    }
    public static String oldestPet(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
        if(pet1.age>pet2.age && pet1.age>pet3.age && pet1.age>pet4.age
                && pet1.age>pet5.age) {
            return pet1.name;
        }else if(pet2.age>pet1.age && pet2.age>pet3.age &&
                pet2.age>pet4.age && pet2.age>pet5.age ){
            return pet2.name;

        }else if(pet3.age>pet1.age && pet3.age>pet2.age &&
                pet3.age>pet4.age && pet3.age>pet5.age ){
            return pet3.name;
        }else if(pet4.age>pet1.age && pet4.age>pet2.age &&
                pet4.age>pet3.age && pet4.age>pet5.age ){
            return pet4.name;
        }else{
            return pet5.name;
        }
    }
    public static double averageWeightOfFivePets(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
       // double totalWeight=pet1.weight+pet2.weight+pet3.weight+pet4.weight+this.weight;
        double average=(pet1.weight+pet2.weight+pet3.weight+pet4.weight+pet5.weight)/5;
        return average;
    }
    public static double averageAgeOfFivePets(Pet pet1,Pet pet2,Pet pet3,Pet pet4,Pet pet5){
        double average=(pet1.age+pet2.age+pet3.age+pet4.age+pet5.age)/5;
        return average;
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Pet pet1=new Pet("Aung net",12,23);
        Pet pet2=new Pet("Aung",2,24);
        Pet pet3=new Pet("net",1,2);
        Pet pet4=new Pet("saw Mya",4,26);
        Pet pet5=new Pet("Saw",5,25);
        System.out.println("Oldest pet :"+Pet.oldestPet(pet1,pet2,pet3,pet4,pet5));
        System.out.println("Youngest pet :"+Pet.youngestPet(pet1,pet2,pet3,pet4,pet5));
        System.out.println("Largest pet :"+Pet.largestPet(pet1,pet2,pet3,pet4,pet5));
        System.out.println("Smallest pet :"+Pet.smallestPet(pet1,pet2,pet3,pet4,pet5));
        System.out.println("Average weight of five pets "+Pet.averageWeightOfFivePets(pet1,pet2,pet3,pet4,pet5));
        System.out.println("Average age of five pets "+Pet.averageAgeOfFivePets(pet1,pet2,pet3,pet4,pet5));

    }
}
