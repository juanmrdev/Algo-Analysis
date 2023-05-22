import algorithms.BubbleSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import utils.GeneratorRandom;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static BubbleSort bubbleSort = new BubbleSort();
    static MergeSort mergeSort = new MergeSort();
    static QuickSort quickSort = new QuickSort();

    static GeneratorRandom generatorRandom = new GeneratorRandom();

    public static void main(String[] args) {

        initSortIntegers();
        initSortAlphaNumerics();

    }

    protected static void initSortIntegers(){
        Random r = new Random();

        int[] array100 = generatorRandom.generateRandomIntArray(r, 100);
        int[] array1000 = generatorRandom.generateRandomIntArray(r, 1000);
        int[] array10000 = generatorRandom.generateRandomIntArray(r, 10000);

        System.out.println("\nOrdenamiento Burbuja:");
        bubbleSort.measureBubbleSortTime("100 elementos Integer", Arrays.copyOf(array100, array100.length));
        bubbleSort.measureBubbleSortTime("1000 elementos Integer", Arrays.copyOf(array1000, array1000.length));
        bubbleSort.measureBubbleSortTime("10000 elementos Integer", Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Merge-Sort:");
        mergeSort.measureMergeSortTime("100 elementos Integer", Arrays.copyOf(array100, array100.length));
        mergeSort.measureMergeSortTime("1000 elementos Integer", Arrays.copyOf(array1000, array1000.length));
        mergeSort.measureMergeSortTime("10000 elementos Integer", Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Quick-Sort:");
        quickSort.measureQuickSortTime("100 elementos Integer", Arrays.copyOf(array100, array100.length));
        quickSort.measureQuickSortTime("1000 elementos Integer", Arrays.copyOf(array1000, array1000.length));
        quickSort.measureQuickSortTime("10000 elementos Integer", Arrays.copyOf(array10000, array10000.length));
    }

    protected static void initSortAlphaNumerics(){
        Random r = new Random();

        String[] array100 = generatorRandom.generateRandomStringArray(r, 100);
        String[] array1000 = generatorRandom.generateRandomStringArray(r, 1000);
        String[] array10000 = generatorRandom.generateRandomStringArray(r, 10000);

        System.out.println("\nOrdenamiento Burbuja:");
        bubbleSort.measureBubbleSortTime("100 elementos AlphaNumeric", Arrays.copyOf(array100, array100.length));
        bubbleSort.measureBubbleSortTime("1000 elementos AlphaNumeric", Arrays.copyOf(array1000, array1000.length));
        bubbleSort.measureBubbleSortTime("10000 elementos AlphaNumeric", Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Merge-Sort:");
        mergeSort.measureMergeSortTime("100 elementos AlphaNumeric", Arrays.copyOf(array100, array100.length));
        mergeSort.measureMergeSortTime("1000 elementos AlphaNumeric", Arrays.copyOf(array1000, array1000.length));
        mergeSort.measureMergeSortTime("10000 elementos AlphaNumeric", Arrays.copyOf(array10000, array10000.length));

        System.out.println("\nOrdenamiento Quick-Sort:");
        quickSort.measureQuickSortTime("100 elementos AlphaNumeric", Arrays.copyOf(array100, array100.length));
        quickSort.measureQuickSortTime("1000 elementos AlphaNumeric", Arrays.copyOf(array1000, array1000.length));
        quickSort.measureQuickSortTime("10000 elementos AlphaNumeric", Arrays.copyOf(array10000, array10000.length));
    }
}

