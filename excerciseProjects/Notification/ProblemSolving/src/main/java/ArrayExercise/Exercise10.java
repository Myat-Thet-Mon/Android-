package ArrayExercise;

public class Exercise10 {
    public static void main(String[] args) {
        int[]num={3,5,1,2,9};
        int max=num[0];
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }else if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Largest number "+max);
        System.out.println("Smallest number "+min);
    }
}
