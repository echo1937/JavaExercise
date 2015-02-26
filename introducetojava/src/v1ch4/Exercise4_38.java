package v1ch4;

import java.util.Scanner;

/**
 * Created by Eric on 2/26/15.
 */
public class Exercise4_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimal = input.nextInt();

        String hexString = "";
        int value = decimal;
        while (value != 0) {                 //对于 decimal 为0的情况，程序不能得出正确结果。
            int single = value % 16;

            if (single == 15)
                hexString = "F" + hexString;
            else if (single == 14)
                hexString = "E" + hexString;
            else if (single == 13)
                hexString = "D" + hexString;
            else if (single == 12)
                hexString = "C" + hexString;
            else if (single == 11)
                hexString = "B" + hexString;
            else if (single == 10)
                hexString = "A" + hexString;
            else
                hexString = single + hexString;

            value = value / 16;


        }

        System.out.println(decimal + "'s hex representation is " + hexString);

    }

}
