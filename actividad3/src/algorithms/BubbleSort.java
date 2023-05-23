package algorithms;

import utils.Timer;

public class BubbleSort<TYPE extends Comparable<TYPE>> extends Timer<TYPE> {

    @SafeVarargs
    public final void measureBubbleSortTime(TYPE[]... arr) {
        for (TYPE[] array : arr) {
            measureSortingTime(array, BubbleSort::bubbleSort);
        }
    }

    private static <TYPE extends Comparable<TYPE>> void bubbleSort(TYPE[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    TYPE temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
