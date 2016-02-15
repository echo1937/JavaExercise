package v5;

import java.util.Scanner;

/**
 * Created by Eric on 2/15/2016.
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lastCorrectLine = null;

        String line;
        while (true) {
            line = input.nextLine();
            if (line.equals("END")) {
                break;
            } else if (!line.startsWith("$GPRMC")) {
                continue;
            } else if (line.startsWith("$GPRMC")) {
                if (!isChecked(line)) {
                    continue;
                }
                lastCorrectLine = line;
            } else {
                System.out.println("Something Wrong");
            }
        }
        printout(lastCorrectLine);
    }

    public static boolean isChecked(String line) {
        int checksum = 0;
        int dollarSign = line.indexOf("$");
        int asterisk = line.indexOf("*");
        String checkNumber = line.substring(asterisk + 1, asterisk + 3);

        for (int i = dollarSign + 1; i < asterisk; i++) {
            checksum = checksum ^ line.charAt(i);
        }
        if (Integer.toHexString(checksum).equalsIgnoreCase(checkNumber)) {
            return true;
        }
        return false;

    }

    public static void printout(String line) {
        int startSeparator = line.indexOf(",");
        String hh = line.substring(startSeparator + 1, startSeparator + 3);
        String mm = line.substring(startSeparator + 3, startSeparator + 5);
        String ss = line.substring(startSeparator + 5, startSeparator + 7);
        int bjhh = (Integer.parseInt(hh) + 8) % 24;

        if (bjhh < 10) {
            hh = "0" + bjhh;
        } else {
            hh = "" + bjhh;
        }

        System.out.printf(hh + ":" + mm + ":" + ss);

    }
}
