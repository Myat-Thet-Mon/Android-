package ch4Project;

import javax.swing.*;
import java.util.Scanner;

/*

 */
public class Exercise4OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = JOptionPane.showInputDialog("Enter numbers");
        int num = Integer.parseInt(num1);
        int result = 0;
        do {
            String ans = JOptionPane.showInputDialog("Enter temperature F or C");
            if (ans.equalsIgnoreCase("f")) {
                double c = 5 * (num - 32) / 9;
                JOptionPane.showMessageDialog(null, "Celsius" + c);
            } else if (ans.equalsIgnoreCase("c")) {
                double f = 9 * (num / 5) + 32;
                JOptionPane.showMessageDialog(null, "Fahrenheit" + f);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                String valid = JOptionPane.showInputDialog("Enter valid temperature f or c");
                ans = input.next();
                if (ans.equalsIgnoreCase("f")) {
                    double c = 5 * (num - 32) / 9;
                    JOptionPane.showMessageDialog(null, "Celsius" + c);
                } else if (ans.equalsIgnoreCase("c")) {
                    double f = 9 * (num / 5) + 32;
                    JOptionPane.showMessageDialog(null, "Fahrenheit" + f);
                }
            }

            result = JOptionPane.showConfirmDialog(null, "Do you want to continue yes or no?");

        } while (result == 0);
    }
}
