package ArrayExercise;

public class Exercise13 {
    public static void main(String[] args) {
        String[]array={"Hate","cat","Dog","cat"};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i].equals(array[j])){
                    System.out.println("Duplication value "+array[i]);
                }
            }
        }
    }
}
