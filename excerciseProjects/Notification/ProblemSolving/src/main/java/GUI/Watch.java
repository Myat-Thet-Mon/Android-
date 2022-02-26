package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Watch extends JPanel {
    int degree = 0;
    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        int hc = getHeight() /2;
        int wc = getWidth() / 2;
        int width = 500;
        int height = 500;
        int x = wc - (width / 2);
        int y = hc - (height /2);


        int secondWidth = 200;

        // Draw the Circle
        canvas.drawOval(x, y, width, height);
        canvas.setColor(Color.RED);
        degree += 6;
        degree = degree % 360; // not greater than 360

        double radian = Math.toRadians(-1 * degree);
        int x2 = wc + (int)(secondWidth * Math.sin(radian));
        int y2 = hc + (int)(secondWidth * Math.cos(radian));
        canvas.drawLine(wc, hc, x2, y2);


//        int p = 100;
//        canvas.drawOval(p, p, getWidth()-(2*p), getHeight()-(2*p));


    }


    public static void main(String[] args) {
        Watch watchPanel=new Watch();
        JFrame frame = new JFrame();
        frame.setContentPane(watchPanel);
        frame.setSize(600, 300);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                watchPanel.repaint();
            }
        });

        timer.start();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
