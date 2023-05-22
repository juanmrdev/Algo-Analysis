package utils;

import java.util.function.Consumer;

public class Timer {

    public static void measureSortingTime(String description, int[] arr, Consumer<int[]> sortingFunction) {
        long startTime = System.nanoTime();
        sortingFunction.accept(arr);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;
        System.out.printf(description + ": %.5f milliseconds.\n", duration);
    }

    public static void measureSortingTime(String description, String[] arr, Consumer<String[]> sortingFunction) {
        long startTime = System.nanoTime();
        sortingFunction.accept(arr);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;
        System.out.printf(description + ": %.5f milliseconds.\n", duration);
    }
}
