package ArrayExercise;

import java.util.Arrays;

public class Exercise9 {
    public static void main2(String[] args) {

        int[] num = {3, 5, 7, 8, 9};
        int[] newNum = new int[num.length + 1];
        int specifiedNum = 4;
        int specifiedPosition = 1;
        boolean result = false;
        for (int i = 0; i < num.length; i++) {
            if (i == specifiedPosition) {
                int tem = num[i];
                newNum[i] = specifiedNum;
                newNum[i + 1] = tem;
                result = true;

            } else {
                if (result == false) {
                    newNum[i] = num[i];
                } else {
                    newNum[i + 1] = num[i];
                }

            }
        }
        System.out.println(Arrays.toString(newNum));


    }

    public static void main(String[] args) {
        int[] num = {3, 5, 7, 8, 9};
        int[] newNum = new int[num.length + 1];
        int specifiedNum = 4;
        int specifiedPosition = 1;

        int firstEmptyRoomIndex = 0;
        for(int i = 0; i< num.length;i++){
            if(specifiedPosition == i){
                newNum[firstEmptyRoomIndex++] = specifiedNum;
            }
            newNum[firstEmptyRoomIndex++] = num[i];
        }
        System.out.println(Arrays.toString(newNum));
    }
}
