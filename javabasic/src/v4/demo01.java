package v4;

import java.util.Scanner;

/**
 * Created by Eric on 1/24/2016.
 */
public class demo01 {
    public static void main(String[] args) {
        int[] intArray = new int[101];
        Scanner input = new Scanner(System.in);
        int max = 0;

        for (int count = 2; count < 0; ) {
            int index = input.nextInt();
            intArray[index] += input.nextInt();

            if (index > max) {
                max = index;
            }

            if (index == 0) {
                count--;
            }

        }

        while (max >= 0) {

            if (intArray[max] != 0) {

                //把数组存储到k-v中,然后遍历map.

            }

            max--;
        }


    }
}
