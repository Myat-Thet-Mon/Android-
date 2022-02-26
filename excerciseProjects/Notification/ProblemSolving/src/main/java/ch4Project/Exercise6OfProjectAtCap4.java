package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise6OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        int score=0;
        while(true) {
            System.out.println("Enter score");
            score = input.nextInt();
            if(score<0){
                break;
            }
            if (score >= 90 && score < 100) {
                a++;
            } else if (score >= 80 && score <= 89) {
                b++;
            } else if (score >= 70 && score <= 79) {
                c++;
            } else if (score >= 60 && score <= 69) {
                d++;
            } else if (score >= 0 && score <= 59) {
                f++;
            }
        }
       int totalGrade=a+b+c+d+f;
        System.out.println("TotalGrade "+totalGrade);
        System.out.println("A "+a);
        System.out.println("B "+b);
        System.out.println("C "+c);
        System.out.println("D "+d);
        System.out.println("F "+f);
    }
}
