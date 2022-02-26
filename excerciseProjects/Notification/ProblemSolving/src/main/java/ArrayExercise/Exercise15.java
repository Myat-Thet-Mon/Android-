package ArrayExercise;

public class Exercise15 {
    public static void main(String[] args) {
        int[]arrayOne={1,5,7};
        int[]arrayTwo={1,2,3};
        for(int i=0;i<arrayOne.length;i++){
            for (int j=0;j<arrayTwo.length;j++){
                if(arrayOne[i]==(arrayTwo[j])){
                    System.out.println("Common : "+arrayOne[i]);
                }
            }
        }
    }
}
