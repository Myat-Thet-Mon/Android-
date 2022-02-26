package ArrayExercise;

public class Exercise31 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        boolean result=false;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        if(sum==30){
            result=true;
        }
        System.out.println("Test "+result);
    }
}
