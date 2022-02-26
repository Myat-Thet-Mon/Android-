package ArrayExercise;

import java.util.Arrays;

public class Exercise42 {
    public static void main(String[] args) {
        int[] num = {0, 1, 1, 0, 0, 1, 0, 1, 0};
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                num[count]=num[i];
                count++;
            }
        }

        System.out.println("C "+count);
        for(int j=0;j<num.length;j++){
            if(num[j]==1){
                num[count]=num[j];
                count++;
            }
        }
        System.out.println(Arrays.toString(num));

        //        int[]newNum=new int[num.length];
//        System.out.println(num.length);
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == 0) {
//                newNum[count] = num[i];
//             //   System.out.println(num[count]);
//                count++;
//
//            }
//        }
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == 1) {
//                newNum[count] = num[i];
//                count++;
//
//            }
//        }
//        System.out.println(Arrays.toString(num));
    }
}
