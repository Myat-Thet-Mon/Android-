package ch4Exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For each coin toss enter either h for heads or t for tails.");
        int i = 0;
        String toss = null;
        int countOfH = 0;
        int countOfT = 0;
        for (i = 1; i <= 8; i++) {
            switch (i) {
                case 1:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("First toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 2:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Second toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 3:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Third toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 4:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Fourth toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 5:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Fifth toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 6:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Sixth toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                case 7:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Seventh toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
                default:
                    System.out.println("Enter h for head or t for tail");
                    toss = input.next();
                    System.out.println("Eighth toss :" + toss);
                    if (toss.equalsIgnoreCase("h")) {
                        countOfH++;
                    } else {
                        countOfT++;
                    }
                    break;
            }
        }
        System.out.println("Number of heads:" + countOfH);
        System.out.println("Number of tails:" + countOfT);
        int total = countOfH + countOfT;
        double percentH = 100 * countOfH / total;
        System.out.println("Percent heads: " + percentH);
        double percentT = 100 * countOfT / total;
        System.out.println("Percent tails: " + percentT);
    }
}
