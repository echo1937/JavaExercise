package v4;

import java.util.Scanner;

public class Demo01a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] polynomial = new int[101];
        int power;
        int time = 0;
        while (time < 2) {
            power = in.nextInt();
            polynomial[power] += in.nextInt();
            if (power == 0) {
                time++;
            }
        }

        boolean allzero = true;

        for (int i = polynomial.length - 1; i > -1; i--) {
            if (polynomial[i] != 0) {
                power = i;

                allzero = false;
                if (polynomial[power] != 1 && polynomial[power] != -1) {
                    System.out.print(polynomial[power]);
                }
                if (polynomial[power] == -1) {
                    System.out.print("-");
                }

                if (power != 0) {
                    System.out.print("x");

                    if (power != 1) {
                        System.out.print(power);
                    }
                }

                for (int j = power - 1; j > -1; j--) {
                    if (polynomial[j] != 0) {
                        if (polynomial[j] > 0) {
                            System.out.print("+");
                            break;
                        } else
                            break;
                    }
                }
            }
        }

        if (allzero) System.out.print("0");
    }
}