package ArrayExercise;

public class Exercise5 {
    public static void main(String[] args) {
        int[]num={3,5,7,8,9};
        int specifiedNum=3;
        boolean result=false;
        for(int i=0;i<num.length;i++){
            if(num[i]==specifiedNum){
                result=true;
                break;
               // System.out.println("This array contained specified number");
            }
        }
        if(result==true){
            System.out.println("This array contained specified number");
        }else{
            System.out.println("This array did not contain specified number");
        }
    }
}
