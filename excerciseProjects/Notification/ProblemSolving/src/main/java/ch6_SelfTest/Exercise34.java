package ch6_SelfTest;

public class Exercise34 {
    /**
     Postcondition: Returns the integer portion of a
     positive number or zero if the number is negative.
     */
    public static int convertValue(double number)
    {
        int result = 0;
        if (number > 0.0)
            result = (int)number;
        return result;
    }
    /**
     Postcondition: Returns the integer portion of a
     positive number or zero if the number is negative.
     */
    public static double convertValue(int number)
    {
        double result = 0;
        if (number > 0.0)
            result = (double)number;
        return result;
    }
    public static void main(String[] args) {

    }

}
