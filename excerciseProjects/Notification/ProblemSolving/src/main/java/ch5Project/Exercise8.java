package ch5Project;

import java.io.IOException;
import java.util.Scanner;

class HangManGame {
    private String secretWord = "banana";
    private StringBuilder disguisedWord = new StringBuilder("??????");
    private int numberOfGuess = 0;
    private int numberOfIncorrectGuess = 0;
    private boolean found = false;

    public void makeGuess(char c) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (c == this.secretWord.charAt(i)) {
                this.disguisedWord.setCharAt(i, c);
                found = true;
            }
        }
        numberOfGuess++;
        if (found == false) {
            this.numberOfIncorrectGuess++;
        }
    }

    public String getDisguisedWord() {
        return this.disguisedWord.toString();
    }

    public String getSecretWord() {
        return this.secretWord;
    }

    public int getGuessCount() {
        return this.numberOfGuess;
    }

    public int getNumberOfIncorrectGuess() {
        return this.numberOfIncorrectGuess;
    }

    public boolean isFound() {
        return secretWord.equalsIgnoreCase(this.disguisedWord.toString());
    }

}

public class Exercise8 {
    public static void main(String[] args) throws IOException {
        HangManGame hangManGame = new HangManGame();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your character");
            char c = (char) System.in.read();
            hangManGame.makeGuess(c);
            System.out.println("Your disguised word :" + hangManGame.getDisguisedWord());
            if (hangManGame.isFound() == true) {
                break;
            }
        }

        System.out.println("Your secret word is :" + hangManGame.getSecretWord());
        System.out.println("The number of guess is :" + hangManGame.getGuessCount());
        System.out.println("The number of incorrect guess is :" + hangManGame.getNumberOfIncorrectGuess());
    }
}