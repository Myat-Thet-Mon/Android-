package ArrayExercise;

public class Exercise12 {
    public static void main(String[] args) {
        int[]num={3,5,7,8,8,9};
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println("Duplication numbers "+num[i]);
                }
            }
        }
    }
}
