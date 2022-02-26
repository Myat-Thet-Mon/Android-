package ch4_SelfTest;

public class Exercise18atCap4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++)
        {
            if (n == 3)
                break;
            System.out.println("Hello");
        }
        System.out.println("After the loop");
    }
}
