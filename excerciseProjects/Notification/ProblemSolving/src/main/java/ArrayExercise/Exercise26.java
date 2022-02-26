package ArrayExercise;

public class Exercise26 {
    public static void main(String[] args) {
        int[]one={2,3,4,5,6,7};
        for(int i=0;i<one.length;i++){
            if(one[i]%2==0){
                System.out.println("Even number is "+one[i]);
            }else{
                System.out.println("Odd number is "+one[i]);
            }
        }
    }
}
