package ch4_SelfTest;

/*
Write a Java loop that will set the variable result equal to 2 5 Initialize
the value of result to 1 and then multiply it by 2 for each of five loop
iterations. Also give any declarations or initializing statements that are
needed.
 */
public class Exercise15atCap4 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i < 5; i++) {
            result = result * 2;
        }
        System.out.println(result);
    }
}
