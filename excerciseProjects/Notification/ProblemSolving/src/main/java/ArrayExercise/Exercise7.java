package ArrayExercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] num = {3, 5, 7, 8, 9};
        int specifiesNum=5;
        int count=0;
        int[]newNum=new int[num.length-1];
        for(int i=0;i<num.length;i++){
            if(num[i]!=specifiesNum){
                newNum[count]=num[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(newNum));


//        //
//        int specifiedNum = 1;
//        int index1 = 0;
//        int index2 = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == specifiedNum) {
//                index1 = num.length - 1;
//            } else if (num[i] != specifiedNum) {
//                index2++;
//            }
//        }
//
//        if (index2 == num.length) {
//            System.out.println("This array does not include specified number " + Arrays.toString(num));
//        } else {
//            int[] newNum = new int[index1];
//            int index = 0;
//            for (int i = 0; i < num.length; i++) {
//                if (num[i] != specifiedNum) {
//                    newNum[index] = num[i];
//                    index++;
//                }
//            }
//            System.out.println("This array includes specified number " + Arrays.toString(newNum));
//        }
    }
}
