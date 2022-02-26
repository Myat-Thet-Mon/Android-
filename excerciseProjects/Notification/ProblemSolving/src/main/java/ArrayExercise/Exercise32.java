package ArrayExercise;

public class Exercise32 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7,8,65,70,70};
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==65){
                count=1;
            }
        }
        int index=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==70){
                index=2;
            }
        }
        if(count+index==3){
            System.out.println("This array includes 65 and 70");
        }else{
            System.out.println("This array does not include 65 and 70");

        }
    }
}
