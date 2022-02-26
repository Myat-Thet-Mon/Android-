package ch4_SelfTest;

public class Exercise17atCap4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 3; n++)
        {
            switch (n)
            {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("Default case");
                    break;
            }
        }
        System.out.println("After the loop");
    }
}
