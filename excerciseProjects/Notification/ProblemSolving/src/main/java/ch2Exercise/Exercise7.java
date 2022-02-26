package ch2Exercise;

/*

 */
public class Exercise7 {
    public static void main(String[] args) {
        String line = "Hello, my good friend!";
        int index=line.indexOf(" ");
        String firstWord = line.substring(0, index);
        System.out.println(firstWord);
    }
}
