package ch3_SelfTest.ch3Project;

/*
output
 */
public class Exercise15atCap3 {
    public static void main(String[] args) {
        int code = 2;
        switch (code) {
            case 1:
                System.out.println("Hello.");
            case 3:
                System.out.println("Good-bye.");
                break;
            default:
                System.out.println("Till we meet again.");
                break;
        }
    }
}