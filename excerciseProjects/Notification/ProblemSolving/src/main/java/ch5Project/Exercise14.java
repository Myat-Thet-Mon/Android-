package ch5Project;

import GUI.Watch;

import javax.swing.*;
import java.awt.*;

class DrawCircularDisk extends JPanel {
    public void paintComponent(Graphics canvas) {
        int hc = getHeight() / 2;
        int wc = getWidth() / 2;
        int width = 500;
        int height = 500;
        int x = wc - (width / 2);
        int y = hc - (height / 2);
        canvas.drawOval(x, y, width, height);
        //canvas.drawArc();
    }
}
    public class Exercise14 {
        public static void main(String[] args) {
            DrawCircularDisk watchPanel=new DrawCircularDisk();
            JFrame frame = new JFrame();
            frame.setContentPane(watchPanel);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
