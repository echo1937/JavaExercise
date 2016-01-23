package v3;

import java.util.Scanner;

/**
 * Created by Eric on 1/23/2016.
 */
public class demo04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        if (inputNumber == 0) {
            System.out.print("ling");
            return;
        } else if (inputNumber < 0) {
            System.out.print("fu ");
            print_number(-inputNumber);
        } else {
            print_number(inputNumber);
        }


    }

    public static void print_number(int inputNumber) {

        int i = -1;
        int[] num = new int[6];
        while (inputNumber > 0) {
            i++;
            num[i] = inputNumber % 10;


            inputNumber /= 10;
        }

        while (i >= 0) {
            switch (num[i]) {
                case 0:
                    System.out.printf("ling");
                    break;
                case 1:
                    System.out.printf("yi");
                    break;
                case 2:
                    System.out.printf("er");
                    break;
                case 3:
                    System.out.printf("san");
                    break;
                case 4:
                    System.out.printf("si");
                    break;
                case 5:
                    System.out.printf("wu");
                    break;
                case 6:
                    System.out.printf("liu");
                    break;
                case 7:
                    System.out.printf("qi");
                    break;
                case 8:
                    System.out.printf("ba");
                    break;
                case 9:
                    System.out.printf("jiu");
                    break;
            }
            if (i != 0) {
                System.out.printf(" ");
            }
            i--;


        }
    }


}
