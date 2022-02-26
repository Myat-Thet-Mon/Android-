package ch4Project;

import javax.swing.*;
import java.awt.*;

public class Exercise21OfProjectAtCap4 extends JPanel {

    public void paintComponent(Graphics canvas) {

        int cx=100;
        int cy=100;
        int l=100;
        int x=cx-(l/2);
        int y=cy-(l/2);
        //first
        canvas.drawOval(x,y,l,l);
        canvas.fillOval(cx-(l/4),cy-(l/4),10,10);
        canvas.fillOval(cx+(l/4),cy-(l/4),10,10);
        canvas.fillOval(cx,cy,10,10);
        canvas.drawArc(cx-(l/4),cy+(l/4)-10,50,20,0,-180);
        int bodyCy=cy+l;
        int bodyX=x;
        int bodyY=bodyCy-(l/2);
        canvas.drawOval(bodyX,bodyY,120,150);
   //    canvas.drawArc(bodyX+(l/2),bodyCy-(l/2),30,70,0,-180);
        canvas.drawOval(cx-l/4,bodyY+145,30,50);
        canvas.drawOval(cx+l/4,bodyY+140,30,50);

        //second
        int secondX=cx+(l/2)+20;
        int secondY=cy-(l/2)+20;
        canvas.drawOval(secondX,secondY,l,l);
        canvas.fillOval(secondX+(l/4),secondY+(l/4),10,10);
        canvas.fillOval(secondX+(l-(l/4)),secondY+(l/4),10,10);
        canvas.fillOval(secondX+(l/2),secondY+(l/2),10,10);
        canvas.drawArc(cx-(l/4),cy+(l/4)-10,50,20,0,-180);
        bodyCy=cy+l;
        bodyX=x;
        bodyY=bodyCy-(l/2);
        canvas.drawOval(bodyX,bodyY,120,150);
        //    canvas.drawArc(bodyX+(l/2),bodyCy-(l/2),30,70,0,-180);
        canvas.drawOval(cx-l/4,bodyY+145,30,50);
        canvas.drawOval(cx+l/4,bodyY+140,30,50);

    }
    public static void main(String[] args) {
        Exercise21OfProjectAtCap4 panel=new Exercise21OfProjectAtCap4();
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}