package ArrayExercise;

public class Exercise23 {
    public static void main(String[] args) {
        int[]one={1,2,3,4,5};
        int[]two={1,2,3,4,5};
        boolean result=false;
        for(int i=0;i<one.length;i++){
            if(one[i]==two[i]){
                result=true;
            }else{
                result=false;
                System.out.println("they are not equal");
                break;
            }
        }
        if(result==true){
            System.out.println("They are equal");
        }
    }
}
