package ch5Project;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

class CircularDisk   {
    private String movieName;
    private String MPAARating;
    private double numberOfPeopleThatRated1;
    private double numberOfPeopleThatRated2;
    private double numberOfPeopleThatRated3;
    private double numberOfPeopleThatRated4;
    private double numberOfPeopleThatRated5;
    private double percentageOfRating1;
    private double percentageOfRating2;
    private double percentageOfRating3;
    private double percentageOfRating4;
    private double percentageOfRating5;
    private double total;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public double getNumberOfPeopleThatRated1() {
        return numberOfPeopleThatRated1;
    }

    public void setNumberOfPeopleThatRated1(int numberOfPeopleThatRated1) {
        this.numberOfPeopleThatRated1 = numberOfPeopleThatRated1;
    }

    public double getNumberOfPeopleThatRated2() {
        return numberOfPeopleThatRated2;
    }

    public void setNumberOfPeopleThatRated2(int numberOfPeopleThatRated2) {
        this.numberOfPeopleThatRated2 = numberOfPeopleThatRated2;
    }

    public double getNumberOfPeopleThatRated3() {
        return numberOfPeopleThatRated3;
    }

    public void setNumberOfPeopleThatRated3(int numberOfPeopleThatRated3) {
        this.numberOfPeopleThatRated3 = numberOfPeopleThatRated3;
    }

    public double getNumberOfPeopleThatRated4() {
        return numberOfPeopleThatRated4;
    }

    public void setNumberOfPeopleThatRated4(int numberOfPeopleThatRated4) {
        this.numberOfPeopleThatRated4 = numberOfPeopleThatRated4;
    }

    public double getNumberOfPeopleThatRated5() {
        return numberOfPeopleThatRated5;
    }

    public void setNumberOfPeopleThatRated5(int numberOfPeopleThatRated5) {
        this.numberOfPeopleThatRated5 = numberOfPeopleThatRated5;
    }

    public double getPercentageOfRating1() {
        return percentageOfRating1;
    }

    public double getPercentageOfRating2() {
        return percentageOfRating2;
    }

    public double getPercentageOfRating3() {
        return percentageOfRating3;
    }

    public double getPercentageOfRating4() {
        return percentageOfRating4;
    }


    public double getPercentageOfRating5() {
        return percentageOfRating5;
    }

    public double getTotal() {
        return total;
    }

    /**
     * if the driver enter value tht greater than 5,this method will do nothing
     *
     * @param rate
     */
    public void addRating(int rate) {
        if (rate <= 5) {
            if (rate == 1) {
                this.numberOfPeopleThatRated1++;
            } else if (rate == 2) {
                this.numberOfPeopleThatRated2++;
            } else if (rate == 3) {
                this.numberOfPeopleThatRated3++;
            } else if (rate == 4) {
                this.numberOfPeopleThatRated4++;
            } else if (rate == 5) {
                this.numberOfPeopleThatRated5++;
            }
        }
    }

    // public double averageRating() {
    //    double average = (1 * this.numberOfPeopleThatRated1) + (2 * this.numberOfPeopleThatRated2) + (3 * this.numberOfPeopleThatRated3) +
    //            (4 * this.numberOfPeopleThatRated4) + (5 * this.numberOfPeopleThatRated5) / 5;
    //    return average;
    // }

    public void percentageOfRating() {
        this.total = this.numberOfPeopleThatRated1 + this.numberOfPeopleThatRated2 + this.numberOfPeopleThatRated3 +
                this.numberOfPeopleThatRated4 + this.numberOfPeopleThatRated5;
        this.percentageOfRating1 = 100 * (this.numberOfPeopleThatRated1 / total);
        this.percentageOfRating2 = 100 * (this.numberOfPeopleThatRated1 / total);
        this.percentageOfRating3 = 100 * (this.numberOfPeopleThatRated1 / total);
        this.percentageOfRating4 = 100 * (this.numberOfPeopleThatRated1 / total);
        this.percentageOfRating5 = 100 * (this.numberOfPeopleThatRated1 / total);
    }


}

public class Exercise13 {
    public static void main(String[] args) {
        CircularDisk obj = new CircularDisk();
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter your rating");
            int rate = input.nextInt();
            obj.addRating(rate);
            System.out.println("Do you want to continue or no");
            ans = input.next();
        } while (!ans.equalsIgnoreCase("no"));

        double total = obj.getNumberOfPeopleThatRated1() + obj.getNumberOfPeopleThatRated1() +
                obj.getNumberOfPeopleThatRated3() + obj.getNumberOfPeopleThatRated4() +
                obj.getNumberOfPeopleThatRated5();
        System.out.println(total);
        // obj.percentageOfRating(total);
        System.out.println("Percentage of rating1 :" + obj.getPercentageOfRating1());
        System.out.println("Percentage of rating2 :" + obj.getPercentageOfRating2());
        System.out.println("Percentage of rating3 :" + obj.getPercentageOfRating3());
        System.out.println("Percentage of rating4 :" + obj.getPercentageOfRating4());
        System.out.println("Percentage of rating5 :" + 100 * (obj.getNumberOfPeopleThatRated5() / total));
        //  System.out.println(obj.getTotal());
    }

}
