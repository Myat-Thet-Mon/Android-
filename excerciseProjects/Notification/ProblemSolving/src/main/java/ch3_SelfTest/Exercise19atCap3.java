package ch3_SelfTest.ch3Project;

/*
change the first line
int key = 3;
output--
 */
public class Exercise19atCap3 {
    public static void main(String[] args) {
        int key = 3;
        switch (key + 1) {
            case 1:
                System.out.println("Cake");
                break;
            case 2:
                System.out.println("Pie");
                break;
            case 3:
                System.out.println("Ice cream");
            case 4:
                System.out.println("Cookies");
                break;
            default:
                System.out.println("Diet time");
        }
    }
}
