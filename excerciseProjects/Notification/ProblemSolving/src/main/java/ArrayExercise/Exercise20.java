package ArrayExercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        List<String> list = new ArrayList<String>();
        for(String text:array) {
            list.add(text);
        }
        System.out.println(list);
    }
}
