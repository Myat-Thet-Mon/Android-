package ch4Exercise;

import GUI.Watch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise17 extends JPanel {
    public static final int numberOfCircle = 4;
    public static final int firstDiameter = 100;
    public static final int xOfFirstCircle = 100;
    public static final int yOfFirstCircle = 100;
    public static final int adjacentCenter = 100;
    public static final int changeDiameter = 50;

    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        canvas.drawOval(xOfFirstCircle, yOfFirstCircle, firstDiameter, firstDiameter);

        int secondDiameter = firstDiameter + changeDiameter;
        int secondX = xOfFirstCircle + firstDiameter / 2 + adjacentCenter;
        int secondY = firstDiameter - secondDiameter / 4;
        canvas.drawOval(secondX, secondY, secondDiameter, secondDiameter);

        int thirdDiameter = secondDiameter + changeDiameter;
        int thirdX = secondX + thirdDiameter / 2 + adjacentCenter;
        int thirdY = firstDiameter - thirdDiameter / 4;
        canvas.drawOval(thirdX, thirdY, thirdDiameter, thirdDiameter);

        int fourthDiameter = thirdDiameter + changeDiameter;
        int fourthX = thirdX + fourthDiameter / 2 + adjacentCenter;
        int fourthY = firstDiameter - fourthDiameter / 4;
        canvas.drawOval(fourthX, fourthY, fourthDiameter, fourthDiameter);
    }

    public static void main(String[] args) {
        Exercise17 watchPanel = new Exercise17();
        JFrame frame = new JFrame();
        frame.setContentPane(watchPanel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
