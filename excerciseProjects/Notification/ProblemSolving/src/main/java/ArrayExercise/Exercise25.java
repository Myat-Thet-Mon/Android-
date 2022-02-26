package ArrayExercise;

public class Exercise25 {
    public static void main(String[] args) {
        int[]one={2,3,4,5,6,7};
        int[]two={1,4,9,2,0};
        int[]three={2,4};

        for(int i=0;i<one.length;i++){
            for (int j=0;j<two.length;j++){
                for(int r=0;r<three.length;r++)
                if(one[i]==(two[j])){
                    if(one[i]==three[r]){
                        System.out.println("Common number : "+one[i]);
                    }

                }
            }
        }
    }
}
