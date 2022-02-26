package ch4_SelfTest;

/*

 */
public class Exercise3atCap4 {
    public static void main(String[] args) {
        int count = 0;
        do
        {
            System.out.println(count);
            count++;
        } while (count < 0);
        System.out.println("count after loop = " + count);
    }
}