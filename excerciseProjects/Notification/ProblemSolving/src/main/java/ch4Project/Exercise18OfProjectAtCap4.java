package ch4Project;

import javax.swing.*;
import java.awt.*;

/*

 */
public class Exercise18OfProjectAtCap4 extends JFrame {

    public void paint(Graphics canvas){
        int h=getHeight()/2;
        int w=getWidth()/2;
        int circleWidth=200;
        int circleHeight=200;
        int x=w-(circleWidth/2);
        int y=h-(circleHeight/2);
        int a=circleWidth/2;
        int b=circleHeight/2;
        canvas.setColor(Color.BLUE);
        canvas.fillOval(x,y,circleWidth,circleHeight);
        canvas.setColor(Color.BLACK);
        canvas.drawLine(w+20,h,w+circleWidth/2-20,h);
       canvas.drawLine(w-20,h,w-circleWidth/2+20,h);
       canvas.drawLine(w,h+20,w,h+circleHeight/2-20);
       canvas.drawLine(w+a/4,h-b/4,w+(a/2+a/4)-20,h-(b/2+b/4));
       canvas.drawLine(w-(a/2),h-(b/2+b/4),w-a/4,h-b/4+20);
       int eyeWidth=400;
       int eyeHeight=400;
       int eye_x=w-(eyeWidth/2);
       int eye_y=h-(eyeHeight/2);
       canvas.drawArc(eye_x,eye_y,eyeWidth,eyeHeight,0,-180);
        canvas.drawArc(eye_x,eye_y,eyeWidth,eyeHeight,0,180);
    }

    public Exercise18OfProjectAtCap4(){
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
    Exercise18OfProjectAtCap4 gui=new Exercise18OfProjectAtCap4();
    gui.setVisible(true);
    }
}
