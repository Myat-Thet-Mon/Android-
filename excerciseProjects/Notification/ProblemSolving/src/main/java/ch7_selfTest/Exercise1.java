package ch7_selfTest;

public class Exercise1 {
    public static void main(String[] args) {
        int[] anArray = new int[10];
        for (int i = 0; i < anArray.length; i++)
            anArray[i] = 2 * i;
        for (int element : anArray)
            System.out.print(element + " ");
        System.out.println();
    }
}
