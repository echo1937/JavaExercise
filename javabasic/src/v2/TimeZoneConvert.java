package v2;

import java.util.Scanner;

/**
 * Created by Eric on 12/22/2015.
 */
public class TimeZoneConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timeOfBJ = input.nextInt();
        System.out.println(convertBJT2UTC(timeOfBJ));
    }

    public static int convertBJT2UTC(int input) {
        int timeOfHour = input / 100;
        int timeOfminute = input % 100;
        int output;
        if (timeOfHour >= 8) {
            output = timeOfHour - 8;
        } else {
            output = timeOfHour - 8 + 24;
        }

        return output * 100 + timeOfminute;
    }
}
