package v1ch5;

import java.util.Scanner;

/**
 * Created by Eric on 4/8/15.
 */
public class Exercise5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter line number: ");
        int lineNumber = input.nextInt();

        displayPattern(lineNumber);
    }

    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = row; i < n; i++) {
                System.out.print("  ");
            }

            for (int i = row; i >= 1; i--) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

    }
}
