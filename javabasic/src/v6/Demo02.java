package v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Eric on 2/15/2016.
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean flag = false;
        for (int i = n; i <= m; i++) {
            if (isChecked(i)) {
                list.add(i);
                flag = true;
            }
        }
        if (flag) {
            String abc = list.toString().replace(",", "");
            abc = abc.substring(1, abc.length() - 1);
            System.out.print(abc);
        } else {
            System.out.println("NIL");
        }

    }

    public static boolean isChecked(int in) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < in; i++) {
            if (in % i == 0) {
                list.add(i);
            }
        }

        int sum = 0;
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            sum += it.next();
        }

        if (sum == in) {
            return true;
        } else return false;

//        if (in == 6 | in == 28 | in == 496) {
//            return true;
//        } else return false;
    }
}
