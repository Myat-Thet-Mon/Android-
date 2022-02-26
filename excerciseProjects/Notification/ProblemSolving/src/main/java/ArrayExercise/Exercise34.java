package ArrayExercise;

import java.util.Arrays;

public class Exercise34 {
    public static void main(String[] args) {
        int[]num={1,4,5,2,11,3,5,8};
        boolean result=false;
        int count=1;
        int ans= Arrays.binarySearch(num,4);
        System.out.println("A "+ans);
//
//        //int result=
//                while(true){
//                    int ans= Arrays.binarySearch(num,count);
//                    System.out.println("A "+ans);
//                    if(count>8){
//                        break;
//                    }
//                    count++;
//                    if(ans>0){
//                        result=true;
//                    }
//                }
//        System.out.println(count);



//       int count=0;
//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num.length;j++){
//                if(i==num[j]){
//                    count=1;
//                    result=true;
//                    continue;
//                }
//            }
//            System.out.println("C "+result);
//        }


//        int count=0;
//        for(int i=0;i<num.length;i++){
//            for(int j=i+1;j<num.length;j++){
//                if(num[i]==num[j]){
//                    System.out.println("A "+num[i]);
//                 count++;
//                }
//            }
//        }
//      //  System.out.println("C "+count);
    }
}
