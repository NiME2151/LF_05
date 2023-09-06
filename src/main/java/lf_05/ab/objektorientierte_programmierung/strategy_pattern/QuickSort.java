package lf_05.ab.objektorientierte_programmierung.strategy_pattern;

public class QuickSort implements Sort {

    @Override
    public double[] sort(double[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(double[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(double[] array, int low, int high) {
        double pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
