package ch4Project;

import java.util.Locale;
import java.util.Scanner;

/*

 */
public class Exercise9OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter word");
            String word = input.next();
            char a = word.charAt(0);
            String s = Character.toString(a);
            String b = word.substring(1);
            String c = b + s;
            c=c.toLowerCase();
            StringBuilder output = new StringBuilder(c).reverse();
            if(output.toString().equals(word)){
                System.out.println(word+" have this property");
            }else{
                System.out.println((word+" does not have this property"));
            }
            System.out.println("do you want to continue or quit");
            ans = input.next();
        } while (ans.equalsIgnoreCase("continue"));
    }
}


