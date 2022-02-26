package ch7_selfTest;

public class Exercise28 {
    public static void main(String[] args) {
        int[][] testArray = new int[3][4];
        for (int row = 0; row < testArray.length; row++)
            for (int col = 0;
                 col < testArray[row].length; col++)
                testArray[row][col] = col;
        for (int row = 0; row < testArray.length; row++) {
            for (int col = 0;
                 col < testArray[row].length; col++)
                System.out.print(testArray[row][col] + " ");
            System.out.println();
        }
    }
}
