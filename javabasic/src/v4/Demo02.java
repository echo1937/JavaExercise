package v4;

import java.util.Scanner;

/**
 * Created by Eric on 1/24/2016.
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[][] board = new int[size][size];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < board.length; i++) {
            numOfO = 0;
            numOfX = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    numOfX++;
                } else {
                    numOfO++;
                }

            }
            if (numOfO == size || numOfX == size) {
                gotResult = true;
                break;
            }
        }
        if (!gotResult) {
            for (int i = 0; i < size; i++) {
                numOfO = 0;
                numOfX = 0;
                for (int j = 0; j < size; j++) {
                    if (board[j][i] == 1) {
                        numOfX++;
                    } else {
                        numOfO++;
                    }
                }
                if (numOfX == size || numOfO == size) {
                    gotResult = true;
                    break;
                }
            }
        }

        if (!gotResult) {
            numOfO = 0;
            numOfX = 0;
            for (int i = 0; i < size; i++) {
                if (board[i][i] == 1) {
                    numOfX++;
                } else {
                    numOfO++;
                }
            }
            if (numOfO == size || numOfX == size) {
                gotResult = true;
            }
        }

        if (!gotResult) {
            numOfO = 0;
            numOfX = 0;
            for (int i = 0; i < size; i++) {
                if (board[i][size - i - 1] == 1) {
                    numOfX++;
                } else {
                    numOfO++;
                }
            }
            if (numOfO == size || numOfX == size) {
                gotResult = true;
            }
        }

        if (gotResult) {
            if (numOfX == size) {
                System.out.println("X");
            } else {
                System.out.println("O");
            }
        } else {
            System.out.println("NIL");
        }


    }
}
