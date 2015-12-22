package v1;

import java.util.Scanner;

/**
 * Created by Eric on 12/22/2015.
 */
public class FToC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempFahr = in.nextInt();
        int tempCelsius = (int) convetCelsiusToFahr(tempFahr);
        System.out.println(tempCelsius);

    }

    public static double convetCelsiusToFahr(double tempFahr) {
        double tempCelsius = (5.0 / 9) * (tempFahr - 32);
        return tempCelsius;
    }
}
