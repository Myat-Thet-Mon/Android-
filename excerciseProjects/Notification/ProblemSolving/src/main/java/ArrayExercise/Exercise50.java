package ArrayExercise;

import java.util.Arrays;

public class Exercise50 {
    public static void main(String[] args) {
        int[]num={-1,4,5,-1,-2,6,7};
        int[]newNum=new int[num.length];
        for(int i=1;i<num.length;i++){
            for(int j=0;j<num.length-i;j++){
                if(num[j]>num[j+1]){
                    int tem=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("A "+num.length/2);
        int count=0;
        for(int i=0;i<3;i++){
            int tem=num[i];
            num[i]=num[num.length-1-i];
            num[i+1]=tem;





//            System.out.println("I "+i);
//            num[count]=num[num.length-1-i];
//            count=count+2;
         //   i=i+1;
        }
//        int index=1;
//        for(int i=0;i<3;i++){
//            System.out.println("I "+i);
//            System.out.println(num[i]);
//            num[index]=num[i];
//            System.out.println("F"+num[index]);
//            index=index+2;
//            //   i=i+1;
//        }
        System.out.println(Arrays.toString(num));

    }
}
