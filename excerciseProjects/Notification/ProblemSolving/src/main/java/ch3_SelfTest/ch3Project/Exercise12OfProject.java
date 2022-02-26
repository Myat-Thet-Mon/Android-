package ch3_SelfTest.ch3Project;

import javax.swing.*;
import java.awt.*;
/*

 */

public class Exercise12OfProject extends JFrame {
    public void paint(Graphics canvas) {
        Graphics2D canvas2d = (Graphics2D) canvas;
        canvas2d.setStroke(new BasicStroke(10));
        canvas2d.setColor(Color.BLUE);
        canvas2d.drawOval(100, 100, 100, 100);
        canvas2d.setColor(Color.BLACK);
        canvas2d.drawOval(220, 100, 100, 100);
        canvas2d.setColor(Color.RED);
        canvas2d.drawOval(340, 100, 100, 100);
        canvas2d.setColor(Color.YELLOW);
        canvas2d.drawOval(160, 150, 100, 100);
        canvas2d.setColor(Color.GREEN);
        canvas2d.drawOval(280, 150, 100, 100);
    }

    public Exercise12OfProject() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Exercise12OfProject guiWindow = new Exercise12OfProject();
        guiWindow.setVisible(true);
    }
}
