package ch4_SelfTest;

public class Exercise19atCap4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++)
        {
            if (n == 3)
                System.exit(0);
            System.out.println("Hello");
        }
        System.out.println("After the loop");
    }
}
