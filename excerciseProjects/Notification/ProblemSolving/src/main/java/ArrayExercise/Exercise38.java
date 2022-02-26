package ArrayExercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise38 {
    public static void main(String[] args) {
        int[]numArray={1,2,1,4,3,3,1,1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int data : numArray){
            if(map.get(data) == null){
                //not there
                map.put(data, 1);
            }else{
                int count = map.get(data);
                count++;
                map.put(data, count);
                //map.put(data, map.get(data) + 1);
            }
        }
        // 1 -> 4
        // 2 -> 1
        // 3 -> 2
        // etc
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > numArray.length /2 ){
                System.out.println("majority element is " + entry.getKey());
                System.out.println("count " + entry.getValue());
                return;
            }
        }

        System.out.println("there is no majority element");

    }
}
