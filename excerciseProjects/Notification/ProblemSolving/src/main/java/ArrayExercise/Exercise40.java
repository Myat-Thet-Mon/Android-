package ArrayExercise;

public class Exercise40 {
    public static void main(String[] args) {
        int[] num = {3, 6, 8, 8, -2, 1, 7};
        int min1 = Integer.MAX_VALUE;
        int min2 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min1) {
                min2 = min1;
                min1 = num[i];
            }
            if (num[i] > min1) {
                if (num[i] < min2) {
                    min2 = num[i];
                }
            }
        }

        System.out.println("The two elements from a given array of positive and" +
                " negative numbers such that their sum is closest to zero :" + min1 + " and " + min2);

        //        int[]num={3,2,9,-1,5};
//        for(int i=1;i<num.length;i++){
//            for(int j=0;j<num.length-i;j++){
//                if(num[j]>num[j+1]){
//                    int tem=num[j];
//                    num[j]=num[j+1];
//                    num[j+1]=tem;
//                }
//            }
//        }

    }
}
