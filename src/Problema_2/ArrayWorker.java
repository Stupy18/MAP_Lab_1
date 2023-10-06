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

    public int maximaleSumme(int[] array) {
        int sum = 0;
        int min = 1000;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
        }

        return sum - min;
    }

    public int minimaleSumme(int[] array) {
        int sum = 0;
        int max = -1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }

        return sum - max;
    }
}
