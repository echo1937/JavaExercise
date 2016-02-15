package v5;

import java.util.Scanner;

/**
 * Created by Eric on 1/24/2016.
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String formatline = line;
        String end = null;
        String front;

        while (true) {
            formatline = formatline.trim();
            int num = formatline.indexOf(' ');

            if (num != -1) {
                front = formatline.substring(0, num);
                end = formatline.substring(num);
                System.out.print(front.length() + " ");
                //             System.out.println(front + "|" + end);
                formatline = end;
            } else if (num == -1) {
                if (formatline.endsWith(".")) {
                    System.out.print(formatline.length() - 1);
                } else {
                    System.out.print(formatline.length());
                }

                break;
            }
        }

    }
}
