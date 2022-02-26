package ch7Project;

import java.util.Scanner;

public class Exercise6 {
    private int numberOfEmployees;
    private int[][] hours;
    private int[] weekHours;
    private int[] dayHours;

    private static final int NUMBER_OF_WORKDAYS = 5;
    private static final int MON = 0;
    private static final int TUE = 1;
    private static final int WED = 2;
    private static final int THU = 3;
    private static final int FRI = 4;
    private static final int NUMBER_OF_EMPLOYEES = 3;

    public Exercise6(){
    numberOfEmployees=0;
    hours=new int[0][0];
    weekHours=new int[0];
    dayHours=new int[0];
    }

    public Exercise6(int theNumberOfEmployees)
    {
        numberOfEmployees = theNumberOfEmployees;
        hours = new int[NUMBER_OF_WORKDAYS][numberOfEmployees];
        weekHours = new int[numberOfEmployees];
        dayHours = new int[NUMBER_OF_WORKDAYS];
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int[][] getHours() {
        return hours;
    }

    public void setHours(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter week hour");
        int weekHour=input.nextInt();
        System.out.println("Enter DayHours");
        int dayHour=input.nextInt();
        int[][]newHour=new int[weekHour][dayHour];
        this.hours = newHour;
    }

    public int[] getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int[] weekHours) {
        this.weekHours = weekHours;
    }

    public int[] getDayHours() {
        return dayHours;
    }

    public void setDayHours(int[] dayHours) {
        this.dayHours = dayHours;
    }

    public void update()
    {
        computeWeekHours();
        computeDayHours();
    }

    private void computeWeekHours()
    {
        for (int employeeNumber = 1; employeeNumber <=
                numberOfEmployees; employeeNumber++) {
            int sum = 0;
            for (int day = MON; day <= FRI; day++)
                sum = sum + hours[day][employeeNumber - 1];
//sum contains the sum of all the hours worked in
//one
//week by the employee with number employeeNumber.
            weekHours[employeeNumber - 1] = sum;
        }
    }

    private void computeDayHours() {
        for (int day = MON; day <= FRI; day++) {
            int sum = 0;
            for (int employeeNumber = 1;
                 employeeNumber <= numberOfEmployees;
                 employeeNumber++)
                sum = sum + hours[day][employeeNumber - 1];
//sum contains the sum of all hours worked by all
//employees on one day.
            dayHours[day] = sum;
        }
    }

    public void showTable() {
        System.out.print("Employee ");
        for (int employeeNumber = 1;
             employeeNumber <= numberOfEmployees;
             employeeNumber++)
            System.out.print(employeeNumber + " ");
        System.out.println("Totals");
        System.out.println();
// row entries
        for (int day = MON; day <= FRI; day++) {
            System.out.print(getDayName(day) + " ");
            for (int column = 0; column < hours[day].length;
                 column++)
                System.out.print(hours[day][column] + " ");
            System.out.println(dayHours[day]);
        }
        System.out.println();
        System.out.print("Total = ");
        for (int column = 0; column < numberOfEmployees; column++)
            System.out.print(weekHours[column] + " ");
        System.out.println();

    }

    //Converts 0 to "Monday", 1 to "Tuesday", etc.
//Blanks are inserted to make all strings the same length.
    private String getDayName(int day)
    {
        String dayName = null;
        switch (day)
        {
            case MON:
                dayName = "Monday ";
                break;
            case TUE:
                dayName = "Tuesday ";
                break;
            case WED:
                dayName = "Wednesday";
                break;
            case THU:
                dayName = "Thursday ";
                break;
            case FRI:
                dayName = "Friday ";
                break;
            default:
                System.out.println("Fatal Error.");
                System.exit(0);
                break;
        }
        return dayName;
    }

    /**
     Reads hours worked for each employee on each day of the
     work week into the two-dimensional array hours. (The method
     for input is just a stub in this preliminary version.)
     Computes the total weekly hours for each employee and
     the total daily hours for all employees combined.
     */
    public static void main(String[] args)
    {
        TimeBook book = new TimeBook(NUMBER_OF_EMPLOYEES);
        book.setHours();
        book.update();
        book.showTable();
    }
}

