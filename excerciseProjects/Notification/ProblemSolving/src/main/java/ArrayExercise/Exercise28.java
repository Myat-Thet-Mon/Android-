package ArrayExercise;

import java.util.Arrays;

public class Exercise28 {
    public static void main(String[] args) {
        int[]num={0,3,2,5,0,7};
        int[]newNum=new int[num.length];
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                newNum[count]=num[i];
                count++;
            }
        }

        System.out.println("C "+count);
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                newNum[count]=num[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newNum));

//        int index=1;
//        for(int i=0;i<num.length-1;i++){
//            if(num[i]==0) {
//                num[num.length-index]=num[i];
//                index++;
//                for(int j=1;j<num.length;j++){
//                    num[i]=num[j];
//                    System.out.println(num[i]);
//                }
//            }
//        }
      //  System.out.println(Arrays.toString(num));
    }
}
