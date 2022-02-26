package ch3_SelfTest.ch3Project;

/*
output
 */
public class Exercise17atCap3 {
    public static void main(String[] args) {
        char letter = 'B';
        switch (letter) {
            case 'A':
            case 'a':
                System.out.println("Some kind of A.");
            case 'B':
            case 'b':
                System.out.println("Some kind of B.");
                break;
            default:
                System.out.println("Something else.");
                break;
        }
    }
}
