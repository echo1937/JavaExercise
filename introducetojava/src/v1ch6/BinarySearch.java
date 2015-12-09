package v1ch6;

/**
 * Created by Eric on 12/9/2015.
 * Page: 175
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);
        System.out.printf("i = %d\nj = %d\nk = %d\nl = %d\nm = %d\n", i, j, k, l, m);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (list[mid] == key) return mid;
            else if (list[mid] < key) low = mid + 1;
            else high = mid - 1;
        }


        return -low - 1;
    }

}
