package ch2Project;

import java.util.Scanner;

/*
Java is the language
is the language java
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a line of text. No punctuation please.");
        String line=input.nextLine();
        System.out.println(line);
        int index=line.indexOf(" ");
        String first=line.substring(0,index);
        String second=line.substring(index+1);
        String upperCase=Character.toString(java.lang.Character.toUpperCase(second.charAt(0)));
        String fourth=second.substring(1);
        String finalString =upperCase+fourth+" "+first;
        System.out.println("I have rephrased that line to read:");
        System.out.println(finalString);

    }
}
