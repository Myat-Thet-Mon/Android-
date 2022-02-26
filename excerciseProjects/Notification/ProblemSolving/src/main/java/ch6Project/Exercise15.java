package ch6Project;

import java.util.Scanner;

class Characteristic {
    private String description;
    private int rating;
    private double compatibilityMeasure;

    public Characteristic(String givenString) {
        this.description = givenString;
        this.rating = 0;
    }

    public String getDescription() {
        return this.description;
    }
    public int getRating() {
        return rating;
    }
    public double getCompatibility(Characteristic otherRating) {
    if(isMatch(otherRating)==true){
        return getCompatibilityMeasure(otherRating);
    }
        return 0;
    }
    private double getCompatibilityMeasure(Characteristic otherRating) {
        if (this.rating==0 || otherRating.rating==0){
            this.compatibilityMeasure=0;
            return this.compatibilityMeasure;
        }else {
            this.compatibilityMeasure = 1 - (((this.rating - otherRating.rating) * (this.rating - otherRating.rating))
                    / 81);
            return this.compatibilityMeasure;
        }
    }
    private boolean isMatch(Characteristic otherRating){
        boolean result;
        if (this.description.equals(otherRating.description)) {
            return result=true;
        } else {
            return result=false;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getCompatibilityMeasure() {
        return compatibilityMeasure;
    }

    public void setCompatibilityMeasure(double compatibilityMeasure) {
        this.compatibilityMeasure = compatibilityMeasure;
    }
}

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your description");
        String description = input.nextLine();
        Characteristic characteristic = new Characteristic(description);
        System.out.println("Enter your rating between 1 to 10");
        int rating = input.nextInt();
        characteristic.setRating(rating);
        System.out.println("Your description " + characteristic.getDescription());
        System.out.println("Your rating is " + characteristic.getRating());
        Characteristic characteristic1 = new Characteristic("Good");
        characteristic1.setRating(rating);
        System.out.println("Compatibility " + characteristic.getCompatibility(characteristic1));

    }
}
