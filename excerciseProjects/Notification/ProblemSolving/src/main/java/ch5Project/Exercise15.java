package ch5Project;

import GUI.MultipleFaces;

import javax.swing.*;

class DrawNoEvil extends JFrame {

}
public class Exercise15 {
    public static void main(String[] args) {
        MultipleFaces watchPanel = new MultipleFaces();
        JFrame frame = new JFrame();
        frame.setContentPane(watchPanel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
