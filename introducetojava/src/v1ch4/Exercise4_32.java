package v1ch4;

import java.util.Scanner;

/**
 * Created by Eric on 8/28/2014.
 */
public class Exercise4_32 {
    public static void main(String[] args) {
        int first = (int) (Math.random() * 10);
        int second = (int) (Math.random() * 10);
        while (first == second) {
            second = (int) (Math.random()) * 10;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two digits lottery pick: ");

        int guess = input.nextInt();
        int guess1 = guess / 10;
        int guess2 = guess % 10;
        if (guess1 == first && guess2 == second) System.out.print("Exact match: you win $10,000");
        else if (guess1 == second && guess2 == first) System.out.print("Match all digit: You win $3,000");
        else if (guess1 == first || guess2 == second) System.out.print("Match one digit: You win $1,000");
        else System.out.print("Sorry, no match");

        System.out.print("Lotter is " + first + second);


    }
}
