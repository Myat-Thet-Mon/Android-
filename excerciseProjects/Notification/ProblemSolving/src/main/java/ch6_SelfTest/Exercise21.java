package ch6_SelfTest;

import java.util.Scanner;

class CircleCalculator{
    private double radius;
    private double area;
    private double circumference;

public CircleCalculator(){
    this.area=0;
    this.radius=0;
    this.circumference=0;
}
    public CircleCalculator(double inputRadius){
        this.radius=inputRadius;
    }
    public static double getArea1(double radius){
        CircleCalculator obj=new CircleCalculator(radius);
        obj.area=Math.PI*obj.radius* obj.radius;
        return obj.area;
    }
    public static double calculateCircumference1(double radius){
        CircleCalculator obj=new CircleCalculator(radius);
        obj.circumference=2*Math.PI*obj.radius;
        return obj.circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
public class Exercise21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius");
      //  CircleCalculator circleCalculator=new CircleCalculator(input.nextDouble());
        System.out.println("Area :"+CircleCalculator.getArea1(input.nextDouble()));
        System.out.println("Circumference :"+CircleCalculator.calculateCircumference1(input.nextDouble()));

    }
}
