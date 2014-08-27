package v1ch4;

import java.util.Scanner;

/**
 * Created by Eric on 8/27/2014.
 */
public class Exercise4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount of money is: ");
        double monthlyDeposit = input.nextDouble();
        System.out.print("The interest of year is: ");
        double interestOfYear = input.nextDouble();
        System.out.print("The number of month is: ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = interestOfYear / 1200.0;

        double currentValue = monthlyDeposit * (1 + monthlyInterestRate);
        //用小于号可以保证在i=1时不进入循环.
        for (int i = 1; i < numberOfMonths; i++) {
            currentValue = (monthlyDeposit + currentValue) * (1 + monthlyInterestRate);
        }
        System.out.println("After the " + numberOfMonths +
                "th month, the account value is " + currentValue);

    }

}
