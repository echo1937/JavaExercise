package v3;

import java.util.Scanner;


/**
 * Created by Eric on 1/23/2016.
 */
public class demo02 {
    public static void main(String[] args) {
        int total = 0;
        int b = 0;
        int numberInLine = 1;

        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();


        while (inputNumber > 0) {
            int eachDigit = inputNumber % 10;

            if ((numberInLine % 2) == (eachDigit % 2)) {
                total += Math.pow(2, numberInLine - 1);

            }

            numberInLine++;
            inputNumber = inputNumber / 10;
        }
        System.out.println(total);


    }
}
