package ch3_SelfTest.ch3Project;

import javax.swing.*;

/*

 */
public class Exercise7OfProject {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter number of cent");
        int cent = Integer.parseInt(input);
        if (cent > 25 && cent < 100 && cent % 5 == 0) {
            cent = 100 - cent;
            int q = cent / 25;
            cent = cent % 25;
            int dime = cent / 10;
            cent = cent % 10;
            int nickel = cent / 5;
            cent = cent % 5;
            int penny = cent;
            JOptionPane.showMessageDialog(null, "Quarter " + q + "\n" + "Dime " + dime + "\n" + "Nickel " + nickel + "\n" + "Penny " + penny);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
