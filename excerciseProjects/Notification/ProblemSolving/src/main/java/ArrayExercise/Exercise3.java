package ArrayExercise;

public class Exercise3 {
    public static void main(String[] args) {
        int [][]array=new int[10][10];
        for(int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(" -  ");
            }
            System.out.println();
        }
    }
}
