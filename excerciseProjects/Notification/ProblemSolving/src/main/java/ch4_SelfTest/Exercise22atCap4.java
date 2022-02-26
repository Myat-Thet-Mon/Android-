package ch4_SelfTest;

/*
Add some suitable output statements to the following code, so that all
variables are traced:
 */
public class Exercise22atCap4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n < 10; n++)//it loop only 1 to 9
            sum = sum + n;
        System.out.println("1 + 2 + ... + 9 + 10 == " + sum);
    }
}
