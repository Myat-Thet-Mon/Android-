package ArrayExercise;

public class Exercise30 {
    public static void main(String[] args) {
        int[] num = {9, 3, 0, 5, 2, -1};
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                count=1;
            }
        }
        int index=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == -1) {
                index=2;
            }
        }
        if(count+index==3){
            System.out.println("This array includes 0 and -1");
        }else{
            System.out.println("This array does not include 0 and -1");

        }
    }
}
