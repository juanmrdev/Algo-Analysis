package algorithms;

import utils.Timer;

import java.util.Arrays;

public class MergeSort<TYPE extends Comparable<TYPE>> extends Timer<TYPE> {

    @SafeVarargs
    public final void measureMergeSortTime(TYPE[]... arr) {
        for (TYPE[] array : arr) {
            measureSortingTime(array, MergeSort::mergeSort);
        }
    }

    public static <TYPE extends Comparable<TYPE>> void mergeSort(TYPE[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        TYPE[] left = Arrays.copyOfRange(arr, 0, mid);
        TYPE[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
    }

    private static <TYPE extends Comparable<TYPE>> void merge(TYPE[] left, TYPE[] right, TYPE[] arr) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = left[i++];
        }

        while (j < rightLength) {
            arr[k++] = right[j++];
        }
    }
}

