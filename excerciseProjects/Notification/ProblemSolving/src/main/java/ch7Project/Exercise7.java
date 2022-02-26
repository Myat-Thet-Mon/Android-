package ch7Project;

import java.util.Scanner;

class TicTacToe {
    public String addAMove(int row, int column, char choiceXorO, char[][] myArray) {
        myArray[row][column] = choiceXorO;
        String finalResult = null;
        if ((myArray[0][0] == 'X' && myArray[0][1] == 'X' && myArray[0][2] == 'X')
                || (myArray[1][0] == 'X' && myArray[1][1] == 'X' && myArray[1][2] == 'X')
                || (myArray[2][0] == 'X' && myArray[2][1] == 'X' && myArray[2][2] == 'X')
                || (myArray[0][0] == 'X' && myArray[1][0] == 'X' && myArray[2][0] == 'X')
                || (myArray[0][1] == 'X' && myArray[1][1] == 'X' && myArray[2][1] == 'X')
                || (myArray[0][2] == 'X' && myArray[1][2] == 'X' && myArray[2][2] == 'X')
                || (myArray[0][2] == 'X' && myArray[1][1] == 'X' && myArray[2][0] == 'X')
                || (myArray[0][0] == 'X' && myArray[1][1] == 'X' && myArray[2][2] == 'X')
        ) {
            finalResult = "X";


        }
        if ((myArray[0][0] == 'O' && myArray[0][1] == 'O' && myArray[0][2] == 'O')
                || (myArray[1][0] == 'O' && myArray[1][1] == 'O' && myArray[1][2] == 'O')
                || (myArray[2][0] == 'O' && myArray[2][1] == 'O' && myArray[2][2] == 'O')
                || (myArray[0][0] == 'O' && myArray[1][0] == 'O' && myArray[2][0] == 'O')
                || (myArray[0][1] == 'O' && myArray[1][1] == 'O' && myArray[2][1] == 'O')
                || (myArray[0][2] == 'O' && myArray[1][2] == 'O' && myArray[2][2] == 'O')
                || (myArray[0][2] == 'O' && myArray[1][1] == 'O' && myArray[2][0] == 'O')
                || (myArray[0][0] == 'O' && myArray[1][1] == 'O' && myArray[2][2] == 'O')
        ) {
            finalResult = "O";

        }
        if(finalResult=="X" ||finalResult =="O") {
            return finalResult;
        }else{
            String tem="No One";
            return tem;
        }
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();
        char[][] myArray = new char[3][3];
        int count = 0;
        int row = 0;
        int column = 0;
        char choice;
        while (true) {
            System.out.println("Enter row and column is not greater than 3");
            row = input.nextInt();
            if (row > 3 || column > 3) {
                System.err.println("Error: row and column must not greater than 3");
            }
            column = input.nextInt();
            count++;
            if (count % 2 == 0) {
                choice = 'O';
            } else {
                choice = 'X';
            }
            String result = ticTacToe.addAMove(row, column, choice, myArray);
            if (result.equals("X")) {
                System.out.println("Winner is X");
                break;
            } else if (result.equals("O")) {
                System.out.println("Winner is O");
                break;
            }
            else if (count > 9) {
                break;
            }
        }
    }
}
