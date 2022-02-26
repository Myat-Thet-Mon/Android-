package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //Convert to object array
        String[] array = list.toArray(new String[]{});
        System.out.println(Arrays.toString(array));
    }
}
