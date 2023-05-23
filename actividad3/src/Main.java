import algorithms.BubbleSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import utils.GeneratorRandom;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static GeneratorRandom generatorRandom = new GeneratorRandom();
    static Random r = new Random();

    public static void main(String[] args) {

        initSortIntegers();
        initSortAlphaNumerics();

    }

    protected static void initSortIntegers(){

        Integer[] array100 = generatorRandom.generateRandomIntArray(r, 100);
        Integer[] array1000 = generatorRandom.generateRandomIntArray(r, 1000);
        Integer[] array10000 = generatorRandom.generateRandomIntArray(r, 10000);

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        QuickSort<Integer> quickSort = new QuickSort<>();

        render(bubbleSort, mergeSort, quickSort, array100, array1000, array10000);
    }

    protected static void initSortAlphaNumerics(){

        String[] array100 = generatorRandom.generateRandomStringArray(r, 100);
        String[] array1000 = generatorRandom.generateRandomStringArray(r, 1000);
        String[] array10000 = generatorRandom.generateRandomStringArray(r, 10000);

        BubbleSort<String>  bubbleSort = new BubbleSort<>();
        MergeSort<String>  mergeSort = new MergeSort<>();
        QuickSort<String>  quickSort = new QuickSort<>();

        render(bubbleSort, mergeSort, quickSort, array100, array1000, array10000);
    }

    protected static <TYPE extends Comparable<TYPE>> void render(
            BubbleSort<TYPE> bubbleSort,
            MergeSort<TYPE> mergeSort,
            QuickSort<TYPE> quickSort,
            TYPE[] array100,
            TYPE[] array1000,
            TYPE[] array10000
    ){
        System.out.println("\nOrdenamiento Burbuja:");

        bubbleSort.measureBubbleSortTime(
                Arrays.copyOf(array100, array100.length),
                Arrays.copyOf(array1000, array1000.length),
                Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Merge-Sort:");
        mergeSort.measureMergeSortTime(
                Arrays.copyOf(array100, array100.length),
                Arrays.copyOf(array1000, array1000.length),
                Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Quick-Sort:");
        quickSort.measureQuickSortTime(
                Arrays.copyOf(array100, array100.length),
                Arrays.copyOf(array1000, array1000.length),
                Arrays.copyOf(array10000, array10000.length));
    }
}

