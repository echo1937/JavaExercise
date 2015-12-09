package v1ch6;

/**
 * Created by Eric on 12/9/2015.
 * Desc : P173
 */

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 5, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) return i;
        }
        return -1;
    }
}
