package ch2Project;

import java.util.Scanner;

/*
I had a dream that Name ate a Color Animal
and said it tasted like Food!
to
I had a dream that Jake ate a blue dog
and said it tasted like hamburger!
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=null;
        line="I had a dream that Name ate a Color Animal\n" +
                "and said it tasted like Food!";
        System.out.println("Enter color");
        String C=input.next();
        System.out.println("Enter food");
        String F=input.next();
        System.out.println("Enter animal");
        String A=input.next();
        System.out.println("Enter name");
        String N=input.next();

        line = line.replace("Color",C)
                .replace("Food", F)
                .replace("Animal",A)
                .replace("Name",N);
//        line = line.replace("Food",F); //
//        line=line.replace("Animal",A);
//        line=line.replace("Name",N);
        System.out.println(line);

    }
}
