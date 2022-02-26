import java.util.Scanner;

/*

 */
public class BMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter pound and feet and inches");
        double pound=input.nextDouble();
        double feet=input.nextDouble();
        double inches=input.nextDouble();
        double heightMeter=((feet * 12) + inches) *0.0254;
        double mass=pound / 2.2;
        double bmi=mass/heightMeter;
        if(bmi>18.5){
            System.out.println("Under weight");
        }else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal weight");
        }else if(bmi>=25 && bmi<30){
            System.out.println("Over weight");
        }else{
            System.out.println("Obese");
        }
    }
}
