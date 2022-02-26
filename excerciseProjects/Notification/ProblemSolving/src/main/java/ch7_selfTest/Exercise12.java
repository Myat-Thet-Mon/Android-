package ch7_selfTest;

public class Exercise12 {
    /** Copies an array. */
    public static int[] copyArray(int[] anArray)
    {
        int[] temp = new int[anArray.length];
        temp = anArray;//it not work tem[i]=anArray[i]
        return temp;
    }
}
