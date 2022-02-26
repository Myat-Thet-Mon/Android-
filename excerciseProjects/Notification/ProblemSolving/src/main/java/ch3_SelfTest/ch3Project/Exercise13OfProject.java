package ch3_SelfTest.ch3Project;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Exercise13OfProject extends JPanel {
    private String choice;
    public Exercise13OfProject(String a){
       choice = a;
    }
    public void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);
        int hc = getHeight() / 2;
        int wc = getWidth() / 2;
        int width = 200;
        int height = 200;
        int x = wc - (width / 2);
        int y = hc - (height / 2);
        int xC = wc - (width / 4);
        int yC = hc - (height / 4);
        if(choice.equalsIgnoreCase("yes")){
            canvas.setColor(Color.BLUE);
        }
        canvas.drawOval(x, y, width, height);

        if(choice.equalsIgnoreCase("yes")){
            canvas.setColor(Color.RED);        }
        canvas.fillOval(xC, yC, width / 2, height / 2);

        if(choice.equalsIgnoreCase("yes")){
            canvas.setColor(Color.GREEN);
        }
        canvas.drawArc(x, y - (height / 2), width, height / 2, 0, -180);
        canvas.drawArc(x - (width / 2), y, width / 2, height, 90, -180);
        canvas.drawArc(wc + (width / 2), y, width / 2, height, 90, 180);
        canvas.drawArc(x - (width / 2) + width / 2, y + height, width, height / 2, 0, 180);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ans=JOptionPane.showInputDialog("Enter yes or no");
        Exercise13OfProject watchPanel = new Exercise13OfProject(ans);
        JFrame frame = new JFrame();
        frame.setContentPane(watchPanel);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}