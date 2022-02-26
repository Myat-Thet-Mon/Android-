package ch6Project;

import javax.swing.*;

class Movie {
    private String movieName;
    private int MPAARating;
    private int numberOfPeopleThatRated1;
    private int numberOfPeopleThatRated2;
    private int numberOfPeopleThatRated3;
    private int numberOfPeopleThatRated4;
    private int numberOfPeopleThatRated5;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(int MPAARating) {
        this.MPAARating = MPAARating;
    }

    public int getNumberOfPeopleThatRated1() {
        return numberOfPeopleThatRated1;
    }

    public void setNumberOfPeopleThatRated1(int numberOfPeopleThatRated1) {
        this.numberOfPeopleThatRated1 = numberOfPeopleThatRated1;
    }

    public int getNumberOfPeopleThatRated2() {
        return numberOfPeopleThatRated2;
    }

    public void setNumberOfPeopleThatRated2(int numberOfPeopleThatRated2) {
        this.numberOfPeopleThatRated2 = numberOfPeopleThatRated2;
    }

    public int getNumberOfPeopleThatRated3() {
        return numberOfPeopleThatRated3;
    }

    public void setNumberOfPeopleThatRated3(int numberOfPeopleThatRated3) {
        this.numberOfPeopleThatRated3 = numberOfPeopleThatRated3;
    }

    public int getNumberOfPeopleThatRated4() {
        return numberOfPeopleThatRated4;
    }

    public void setNumberOfPeopleThatRated4(int numberOfPeopleThatRated4) {
        this.numberOfPeopleThatRated4 = numberOfPeopleThatRated4;
    }

    public int getNumberOfPeopleThatRated5() {
        return numberOfPeopleThatRated5;
    }

    public void setNumberOfPeopleThatRated5(int numberOfPeopleThatRated5) {
        this.numberOfPeopleThatRated5 = numberOfPeopleThatRated5;
    }

    /**
     * if the driver enter value tht greater than 5,this method will do nothing
     *
     * @param rate
     */
    public void addRating(int rate) {
        if (rate <= 5) {
            if (rate == 1) {
                numberOfPeopleThatRated1++;
            } else if (rate == 2) {
                numberOfPeopleThatRated2++;
            } else if (rate == 3) {
                numberOfPeopleThatRated3++;
            } else if (rate == 4) {
                numberOfPeopleThatRated4++;
            } else if (rate == 5) {
                numberOfPeopleThatRated5++;
            }
        }
    }

    public double averageRating() {
        double average = (1 * this.numberOfPeopleThatRated1) + (2 * this.numberOfPeopleThatRated1) + (3 * this.numberOfPeopleThatRated1) +
                (4 * this.numberOfPeopleThatRated1) + (5 * this.numberOfPeopleThatRated1) / 5;
        return average;
    }
}

public class Exercise14 {
    public static void main(String[] args) {

    }
}
