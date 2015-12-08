package v1ch6;

/**
 * Created by Eric on 12/8/2015.
 */
public class BinarySearch_P174 {
    public static void main(String[] args) {

        BinarySearch(new int[]{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}, 4);
        BinarySearch(new int[]{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70}, 2);
        BinarySearch(new int[]{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}, 79);
        BinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, 14);
    }

    public static int BinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        System.out.println("low  high  mid");

        while (high >= low) {
            int mid = (low + high) / 2;
            System.out.printf(" %-3d, %-3d, %-3d\n", low, high, mid);

            if (key < list[mid]) high = mid - 1;
            else if (key == list[mid]) {
                System.out.printf("the return is %d\n\n", mid);
                return mid;
            } else low = mid + 1;
        }
        System.out.println("The return is " + (-low - 1) + "\n");
        return -low - 1;
    }
}
