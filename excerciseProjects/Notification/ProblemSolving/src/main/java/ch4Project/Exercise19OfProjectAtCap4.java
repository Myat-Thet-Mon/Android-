package ch4Project;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/*

 */
public class Exercise19OfProjectAtCap4 extends JPanel {

    public void paintComponent(Graphics2D canvas, int num, int x, int y, int r, int changeX, int changeR) {
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                canvas.setColor(Color.RED);
            } else if (i == 2) {
                canvas.setColor(Color.GREEN);
            } else if (i == 3) {
                canvas.setColor(Color.BLUE);
                i = 1;
            }
            canvas.drawOval(x, y, r * 2, r * 2);
            x = x + r * 2 + changeX;
            r = r + changeR;
        }
    }

    public static void main(String[] args) {
        Exercise19OfProjectAtCap4 panel = new Exercise19OfProjectAtCap4();
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of circle");
        int numberOfCircle = input.nextInt();
        System.out.println("Enter radius");
        int radius = input.nextInt();
        System.out.println("Enter changeRadius");
        int changeRadius = input.nextInt();
        System.out.println("Enter x");
        int x = input.nextInt();
        System.out.println("Enter y");
        int y = input.nextInt();
        System.out.println("Enter changeX");
        int changeX = input.nextInt();
        frame.setSize(600, 300);
       // panel.paintComponent(numberOfCircle,x,y,radius,changeX,changeRadius);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
