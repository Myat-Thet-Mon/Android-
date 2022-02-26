package ch4Project;

import javax.swing.*;
import java.awt.*;

/*

 */
public class Exercise17OfProjectAtCap4 extends JPanel {

        public void paintComponent(Graphics canvas) {

            int h = getHeight() / 2;
            int w = getWidth() / 2;
            int circleWidth = 300;
            int circleHeight = 300;
            int x = w - (circleWidth / 2);
            int y = h - (circleHeight / 2);
            canvas.drawOval(x, y, circleWidth, circleHeight);

        }
        public static void main (String[]args){
            Exercise17OfProjectAtCap4 panel = new Exercise17OfProjectAtCap4();
            JFrame frame = new JFrame();
            frame.setContentPane(panel);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}
