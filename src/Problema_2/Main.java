package Problema_2;

public class Main {
    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        int[] array = {14, 5, 3, 6, 7, 1, 123, 154};
        System.out.println(arrayWorker.maximalZahl(array));
        System.out.println(arrayWorker.minimalZahl(array));
    }
}
