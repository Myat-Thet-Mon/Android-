package ArrayExercise;

import java.util.Arrays;

public class Exercise24 {
    public static void main(String[] args) {
//        int[] num = {1, 6, 4, 5, 9, 7, 2, 8};
//        int max = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] > max) {
//                max = num[i];
//            }
//        }

        int arr[] = {1,2,4,5,6};
        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=1;i<max;i++){
            int result = Arrays.binarySearch(arr,i);
            if (result < 0) {
                 System.out.println("Missing number is "+i);
            }
        }



//        int[]newNum=new int[num.length+1];
//
//        for(int i=0;i<num.length-1;i++){
//                        if(num[i]+1==num[i+1]){
//                newNum[i]=num[i];
//                System.out.println("A "+newNum[i]);
//            }else{
//                newNum[i]=num[i];
//                System.out.println(newNum[i]);
//                newNum[i+1]=newNum[i]+1;
//                System.out.println(newNum[i+1]);
//            }
//        }
//        System.out.println(Arrays.toString(newNum));
//


//            if(num[i]+1==num[i+1]){
//                newNum[i]=num[i];
//                System.out.println("A "+newNum[i]);
//            }else{
//                newNum[i]=num[i];
//                System.out.println(newNum[i]);
//                newNum[i+1]=newNum[i]+1;
//                System.out.println(newNum[i+1]);
//            }

        // System.out.println(Arrays.toString(newNum));


//        for (int i=0;i<=num.length;i++){
//            if(num[i]+1==num[i+1]){
//                newNum[i]=newNum[i];
//            }else if(num[i]+1!=num[i+1]){
//                //newNum
//            }
//        }
    }
}
