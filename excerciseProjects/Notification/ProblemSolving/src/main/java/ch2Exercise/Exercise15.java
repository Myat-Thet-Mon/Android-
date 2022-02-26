package ch2Exercise;

import javax.swing.*;
import java.awt.*;

public class Exercise15 extends JFrame {
    public static final int x=100;
    public static final int y=100;
    public static final int length=100;

    public void paint(Graphics canvas) {
        Graphics2D canvas2d = (Graphics2D) canvas;
        canvas2d.setStroke(new BasicStroke(2));

        canvas2d.drawOval(x, y, length, length);
        canvas2d.drawOval(x+120, y, length, length);
        canvas2d.drawOval(x+240, y, length, length);
        canvas2d.drawOval(x+60, y+50, length, length);
        canvas2d.drawOval(x+180, y+50, length,length);
    }

    public Exercise15() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Exercise15 guiWindow = new Exercise15();
        guiWindow.setVisible(true);
    }
}
