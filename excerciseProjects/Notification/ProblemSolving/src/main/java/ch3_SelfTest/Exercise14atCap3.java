package ch3_SelfTest.ch3Project;

/*
What output is produced by the following statements?
 */
public class Exercise14atCap3 {
    public static void main(String[] args) {
        int x=5;
        System.out.println(true &&false);
        System.out.println(true || false);
        System.out.println(false && (x > 0));
        System.out.println(true || (x > 0));
    }
}
