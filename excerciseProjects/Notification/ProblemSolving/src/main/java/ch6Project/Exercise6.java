package ch6Project;

import java.util.Scanner;

class Time {
    private int hour;
    private int minute;
    private boolean result = false;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * if hour is greater than 24 ,this method do nothing
     */
    public void getTime24() {
        if (this.hour <= 24 && this.hour >= 0 && this.minute >= 0) {

            //for hour
            if (this.minute > 59) {
                this.hour += this.minute / 60;
            }
            if (hour < 10) {
                System.out.print("0");
                System.out.print(this.hour);

            } else {
                System.out.print(this.hour);
            }

            //for minute
            if (this.minute < 10) {
                System.out.print("0");
                System.out.println(this.minute);
            } else {
                if (this.minute > 59) {
                    this.minute = this.minute % 60;
                }
                System.out.println(this.minute);
            }
        }
    }

    public void getTime12() {
        if (this.hour <= 24 && this.hour >= 0 && this.minute >= 0) {
            if (this.minute > 59) {
                this.hour += this.minute / 60;
            }

            //AM or PM
            if (this.hour >= 12) {
                this.result = true;
            }

            if (this.hour > 12 && this.hour<24) {
                this.hour = this.hour - 12;
                System.out.print(this.hour);
            }else if(this.hour==24){
                System.out.print("00");
            }
            else if (this.hour == 0) {
                System.out.print("12");
            } else if (this.hour <= 12) {
                System.out.print(this.hour);
            }

            System.out.print(":");

            //for minute
            if (this.minute < 10) {
                System.out.print("0");
                System.out.print(this.minute);
            } else {
                if (this.minute > 59) {
                    this.minute = this.minute % 60;
                }
                System.out.print(this.minute);
            }
        }
        if (this.result == true) {
            System.out.println("PM");
        } else {
            System.out.println("AM");
        }

    }
}


public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hour and hour is no greater than 24");
        int hour = input.nextInt();
        System.out.println("Enter minute");
        int minute = input.nextInt();
        Time time = new Time(hour, minute);
        time.getTime24();
        time.getTime12();
    }
}
