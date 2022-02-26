package ArrayExercise;

public class Exercise41 {
    public static void main(String[] args) {
        int[]num={3,2,9,-1,5};
        for(int i=1;i<num.length;i++){
            for(int j=0;j<num.length-i;j++){
                if(num[j]>num[j+1]){
                    int tem=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tem;
                }
            }
        }
        System.out.println("Smallest number "+num[0]);
        System.out.println("Second smallest "+num[1]);
    }
}
