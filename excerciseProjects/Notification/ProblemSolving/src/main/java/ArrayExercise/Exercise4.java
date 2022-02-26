package ArrayExercise;

public class Exercise4 {
    public static void main(String[] args) {
        int[]num={1,5,6,8};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        double average=(double)sum/num.length;
        System.out.println("Average "+average);
    }
}
