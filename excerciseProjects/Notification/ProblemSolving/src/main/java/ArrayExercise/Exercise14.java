package ArrayExercise;

public class Exercise14 {
    public static void main(String[] args) {
        String[]arrayOne={"One","Three","Five"};
        String[]arrayTwo={"Two","Four","Three"};
        for(int i=0;i<arrayOne.length;i++){
            for (int j=0;j<arrayTwo.length;j++){
                if(arrayOne[i].equals(arrayTwo[j])){
                    System.out.println("Common : "+arrayOne[i]);
                }
            }
        }
    }
}
