package lf_05.ab.objektorientierte_programmierung.strategy_pattern;

import java.util.Arrays;

class Runner {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        double[] arr1 = {1, 5, 7, 2, 7, 4, 10};
        double[] arr2 = {1, 5, 7, 2, 7, 4, 10};
        System.out.println("unsorted: " + Arrays.toString(arr1));
        System.out.println("bubble: " + Arrays.toString(bubbleSort.sort(arr1)));
        System.out.println("quick: " + Arrays.toString(quickSort.sort(arr2)));
    }
}
