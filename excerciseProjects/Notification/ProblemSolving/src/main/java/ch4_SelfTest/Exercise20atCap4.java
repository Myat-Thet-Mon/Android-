package ch4_SelfTest;
/*
Revise the loop shown in Listing 4.6 to use a break statement instead of
the boolean variable areMore . Comment on how your loop compares
with the original one.
 */
import java.util.Scanner;
/**
 Illustrates the use of a boolean variable to end loop iteration.
 */
public class Exercise20atCap4
{
    public static void main(String[] args)
   {
        /*
        System.out.println("Enter nonnegative numbers.");
        System.out.println("Place a negative number at the end");
        System.out.println("to serve as an end marker.");
        int sum = 0;
        boolean areMore = true;
        Scanner keyboard = new Scanner(System.in);
        while (areMore)
        {
            int next = keyboard.nextInt();
            if (next < 0)
                areMore = false;
            else
                sum = sum + next;
        }
        System.out.println("The sum of the numbers is " + sum);

    */
        Scanner input=new Scanner(System.in);
        int num=0;
        int result=0;
        while(num>=0){

            System.out.println("Enter non negative number");
            num=input.nextInt();
            if(num<0){
                break;
            }
            result=result+num;
        }
      System.out.println(result);
    }
}
