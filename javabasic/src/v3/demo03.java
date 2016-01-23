package v3;

import java.util.Scanner;

/**
 * Created by Eric on 1/23/2016.
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
//        int n = 2, m = 4;

        int k = 0, total = 0;

        int[] prime = new int[200];


        for (int i = 2; k < m; i++) {

            if (isPrime(i)) {
                prime[k] = i;
                k++;
            }
        }


        for (int x = n - 1; x <= m - 1; x++) {
            total += prime[x];
        }
        System.out.println(total);


    }

    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

