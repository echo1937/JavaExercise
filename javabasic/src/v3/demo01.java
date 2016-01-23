package v3;

import java.util.Scanner;

/**
 * Created by Eric on 1/23/2016.
 */
public class demo01 {
    public static void main(String[] args) {
        int numberOfEven = 0, numberOfOdd = 0;
        int number = -1;
        Scanner input = new Scanner(System.in);
        while (true) {
            number = input.nextInt();
            if (number == -1) {
                break;
            } else if (isEven(number)) {
                numberOfEven++;
            } else {
                numberOfOdd++;
            }
        }

        System.out.println(numberOfOdd + " " + numberOfEven);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
