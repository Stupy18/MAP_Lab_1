package Problema_2;

public class ArrayWorker {
    public int maximalZahl(int[] array) {
        int max = -1;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int minimalZahl(int[] array) {
        int min = 1000;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
