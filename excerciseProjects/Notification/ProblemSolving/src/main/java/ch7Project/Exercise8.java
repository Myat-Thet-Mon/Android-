package ch7Project;



import java.util.Arrays;
import java.util.Scanner;

class NewMovie{
    private String movieName;
    private int[] rating=new int[5];

    public void addRating(int rate) {

        if (rate == 1) {
                rating[0]+=1;
            } else if (rate == 2) {
                rating[1]+=1;
            } else if (rate == 3) {
                rating[2]+=1;
            } else if (rate == 4) {
                rating[3]+=1;
            } else if (rate == 5) {
                rating[4]+=1;
            }
    }
    public double averageRating() {
        double average = (double) ((1 * rating[0]) + (2 * rating[1]) + (3 * rating[2]) +
                (4 * rating[3]) + (5 * rating[4]) )/ 5;
        return average;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        NewMovie obj = new NewMovie();
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter your rating");
            int rate = input.nextInt();
            obj.addRating(rate);
            System.out.println("Do you want to continue yes or no");
            ans = input.next();
        } while (ans.equalsIgnoreCase("yes"));

        int[]newArray= obj.getRating();
        for (int i=1;i<=5;i++){
            System.out.print(" "+i+" ");
        }
        System.out.println( );
        System.out.println(Arrays.toString(newArray));
 //       System.out.println("A "+newArray[3]);
        System.out.println("Average rating is :" + obj.averageRating());
    }
}
