package Problema_2;

public class Main {
    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        int[] array = {1,2,3,4};
        System.out.println(arrayWorker.maximalZahl(array));
        System.out.println(arrayWorker.minimalZahl(array));
        System.out.println(arrayWorker.maximaleSumme(array));
        System.out.println(arrayWorker.minimaleSumme(array));
    }
}
