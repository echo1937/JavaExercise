package v4;

import java.util.Scanner;

/**
 * Created by Eric on 1/24/2016.
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] intArray = new int[101];
        Scanner input = new Scanner(System.in);
        int max = 0;

        for (int count = 2; count > 0; ) {
            int index = input.nextInt();
            intArray[index] += input.nextInt();

            if (index > max) {
                max = index;
            }

            if (index == 0) {
                count--;
            }

        }

        boolean allZero = true;
        for (int i = max; i > -1; i--) {
            int coefficient = intArray[i];

            if (coefficient != 0) {
                allZero = false;

                if (coefficient != 1 && coefficient != -1) {
                    System.out.print(coefficient);
                } else if (coefficient == -1) {
                    System.out.print("-");
                }

                if (i != 0) {
                    System.out.printf("x");
                    if (i != 1) {
                        System.out.printf("%d", i);
                    }
                }

                for (int j = i - 1; j > -1; j--) {
                    if (intArray[j] != 0) {
                        if (intArray[j] > 0) {
                            System.out.printf("+");
                            break;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        if (allZero) {
            System.out.printf("0");
        }
    }
}
