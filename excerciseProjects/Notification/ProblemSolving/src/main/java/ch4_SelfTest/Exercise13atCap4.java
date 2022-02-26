package ch4_SelfTest;

public class Exercise13atCap4 {
    public static void main(String[] args) {
        for (int count = 0; count <= 3; count++)
            for (int count2 = 0; count2 < count; count2++)
                System.out.println(count2);
    }
}
