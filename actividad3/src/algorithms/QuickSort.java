package algorithms;

import utils.Timer;

public class QuickSort<TYPE extends Comparable<TYPE>> extends Timer<TYPE>{
    @SafeVarargs
    public final void measureQuickSortTime(TYPE[]... arr) {
        for (TYPE[] array : arr) {
            measureSortingTime(array, QuickSort::quickSort);
        }
    }

    private static <TYPE extends Comparable<TYPE>> void quickSort(TYPE[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static <TYPE extends Comparable<TYPE>> void quickSort(TYPE[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static <TYPE extends Comparable<TYPE>> int partition(TYPE[] arr, int low, int high) {
        TYPE pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i].compareTo(pivot) < 0);

            do {
                j--;
            } while (arr[j].compareTo(pivot) > 0);

            if (i >= j) {
                return j;
            }

            swap(arr, i, j);
        }
    }

    private static <TYPE extends Comparable<TYPE>> void swap(TYPE[] arr, int i, int j) {
        TYPE temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

