package ch3_SelfTest.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise2OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 and number2 and number3");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 > 0 && num2 > 0 && num3 > 0) {
          if(num1>num2) {
              if (num1 > num3) {
                  if (num2 > num3) {
                      System.out.println("increasing order " + num3 + " " + num2 + " " + num1);
                  } else if (num2 == num3) {
                      System.out.println("increasing order " + num3 + " " + num2 + " " + num1);
                  } else if (num2 < num3) {
                      System.out.println("increasing order " + num2 + " " + num3 + " " + num1);
                  }
              } else if (num1 == num3) {
                  System.out.println("increasing order " + num2 + " " + num3 + " " + num1);
              } else if (num1 < num3) {
                  System.out.println("increasing order " + num2 + " " + num1 + " " + num3);
              }

          }else if(num1==num2){
                    if(num1>num3){
                        System.out.println("increasing order " + num3 + " " + num2 + " " + num1);
                    }else if(num1==num3){
                        System.out.println("increasing order " + num3 + " " + num2 + " " + num1);
                    }else if(num1<num3){
                        System.out.println("increasing order " + num2 + " " + num1 + " " + num3);
                    }
                }else if (num1<num2){
                    if(num1>num3){
                        System.out.println("increasing order " + num3+ " " + num1 + " " + num2);
                    }else if(num1==num3){
                        System.out.println("increasing order " + num2 + " " + num3 + " " + num1);
                    }else if(num1<num3){
                        if(num2>num3){
                            System.out.println("increasing order " + num1 + " " + num3 + " " + num2);
                        }else if(num2==num3){
                            System.out.println("increasing order " + num1 + " " + num3 + " " + num2);
                        }else if(num2<num3){
                            System.out.println("increasing order " + num1 + " " + num2 + " " + num3);
                        }
                    }
                }

                }





    }
}
