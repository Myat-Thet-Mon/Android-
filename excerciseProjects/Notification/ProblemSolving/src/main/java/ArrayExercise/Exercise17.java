package ArrayExercise;

public class Exercise17 {
    public static void main(String[] args) {
        int[] num = {2, 6, 8, 8, 2, 1,7};

        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            }
            if (num[i] < max1) {
                if (num[i] > max2) {
                    max2 = num[i];
                }
            }
        }
        System.out.println(max2);
//        for(int i=1;i<num.length;i++){
//            for(int j=0;j<num.length-i;j++){
//                if(num[j]>num[j+1]){
//                    int tem=num[j];
//                    num[j]=num[j+1];
//                    num[j+1]=tem;
//                }
//            }
//        }
//        for(int i=1;i<num.length-1;i++){
//            if(num[num.length-1]>num[num.length-i-1]) {
//                System.out.println("second largest is " + num[num.length - i-1]);
//                break;
//            }
//        }
    }
}
