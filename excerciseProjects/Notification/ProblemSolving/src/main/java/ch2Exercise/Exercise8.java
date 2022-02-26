package ch2Exercise;

/*

 */
public class Exercise8 {
    public static void main(String[] args) {
        String line = "Hello, my good friend!";
        int index = line.indexOf(" ");
        int second = line.indexOf(" ", line.indexOf(" ") + 1);
        String secondWord = line.substring(index + 1, second);
        System.out.println("Second word " + secondWord);

    }
}
