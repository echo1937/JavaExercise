package v1ch6;

/**
 * Created by Eric on 12/9/2015.
 * Desc: P177
 */
public class InsertionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        insertionSort(list);
        System.out.println();
        r_insertionSort(list);
    }

    public static void insertionSort(double[] list) {
        for (int i = 1; i <= list.length - 1; i++) {
            double currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) list[k + 1] = list[k];
            list[k + 1] = currentElement;

            printList(list);
        }
    }

    public static void r_insertionSort(double[] list) {
        for (int i = 1; i <= list.length - 1; i++) {
            double currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k] < currentElement; k--) list[k + 1] = list[k];
            list[k + 1] = currentElement;
            printList(list);
        }
    }


    public static void printList(double[] list) {
        for (int j = 0; j < list.length; j++) System.out.print(list[j] + "  ");
        System.out.println();
    }
}
