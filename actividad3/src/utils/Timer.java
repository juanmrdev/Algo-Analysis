package utils;

import java.util.function.Consumer;

public class Timer<TYPE extends Comparable<TYPE>> {

    public static <TYPE extends Comparable<TYPE>> void measureSortingTime(TYPE[] arr, Consumer<TYPE[]> sortingFunction) {
        long startTime = System.nanoTime();
        sortingFunction.accept(arr);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1_000_000.0;
        System.out.printf(arr.length + " elementos" + ((arr instanceof Integer[]) ? " numericos" : " alfaNumericos") + ": %.5f milliseconds.\n", duration);
    }
}
