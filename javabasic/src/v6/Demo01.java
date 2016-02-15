package v6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Eric on 2/15/2016.
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        ArrayList<Integer> list = Factorize(in);
        printout(list, in);
    }

    public static ArrayList<Integer> Factorize(int num) {
        int key = 1;
        int number = num;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    key = i;
                    list.add(key);
                    break;
                }
            }
            number /= key;
        }
        return list;
    }


    public static void printout(ArrayList<Integer> list, int num) {
        System.out.printf("%d=%d", num, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.printf("x%d", list.get(i));
        }
    }
}
