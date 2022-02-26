package ch3_SelfTest;

/*

 */
public class Exercise7atCap3 {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 5;
        if (x1 == x2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        String a = Integer.toString(x1);
        String b = Integer.toString(x2);
        if (a.equals(b)) {
            System.out.println("String :true");
        } else {
            System.out.println("String :false");
        }

    }
}
