package ch4Project;

import javax.swing.*;
import java.awt.*;

public class Exercise20OfProjectAtCap4 extends JPanel {
    int degree = 0;
    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        int cx = 400;
        int cy = 400;
        int length = 40;
        int startAngle = 0;
        int deltaAngle = 1;

        for(int i = 0;i <1000; i++){
            int x = cx -(length/2);
            int y = cy-(length/2);
            canvas.drawArc(x, y, length, length, startAngle, startAngle + deltaAngle);
            length = length + 1;
            startAngle = startAngle + deltaAngle;
            startAngle = startAngle % 360;
            //if(startAngle == 360) startAngle = 0;
        }

    }
    public static void main(String[] args) {
        Exercise20OfProjectAtCap4 panel=new Exercise20OfProjectAtCap4();
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
