package ch3_SelfTest.ch3Project;

import javax.swing.*;

/*
Write code for a JOptionPane dialog that will ask whether the user is at
least 18 years of age. Then set the boolean variable adult equal to either
true , if the user is at least 18, or false otherwise. Include the declaration
of the variable adult.
 */
public class Exercise23atCap3 {
    public static void main(String[] args) {
        String age = JOptionPane.showInputDialog("Enter age");
        int newAge = Integer.parseInt(age);
        if (newAge >= 18) {
            JOptionPane.showMessageDialog(null, "True");
        } else {
            JOptionPane.showMessageDialog(null, "False");
        }
    }
}