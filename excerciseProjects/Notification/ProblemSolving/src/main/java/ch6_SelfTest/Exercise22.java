package ch6_SelfTest;

public class Exercise22 {
    public static void main(String[] args) {
        Integer n = new Integer(77);
        int m = 77;
        n = m;
        m = n;
        //legal
    }
}
