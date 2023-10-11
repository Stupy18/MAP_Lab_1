package Problema_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayWorkerTest {

    @Test
    public void testMaximalZahlForExpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {10, 5, 20, 15, 30};
        int max = worker.maximalZahl(array);
        assertEquals(30, max);
    }

    @Test
    public void testMaximalZahlForUnexpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {};
        int max = worker.maximalZahl(array);
        assertEquals(-1, max);
    }

    @Test
    public void testMinimalZahlForExpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {10, 5, 20, 15, 30};
        int min = worker.minimalZahl(array);
        assertEquals(5, min);
    }

    @Test
    public void testMinimalZahlForUnexpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {};
        int min = worker.minimalZahl(array);
        assertEquals(-1, min);
    }

    @Test
    public void testMaximaleSummeForExpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {10, 5, 20, 15, 30};
        int sum = worker.maximaleSumme(array);
        assertEquals(75, sum);
    }

    @Test
    public void testMaximaleSummeForUnexpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {};
        int sum = worker.maximaleSumme(array);
        assertEquals(-1, sum);
    }

    @Test
    public void testMinimaleSummeForExpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {10, 5, 20, 15, 30};
        int sum = worker.minimaleSumme(array);
        assertEquals(50, sum);
    }

    @Test
    public void testMinimaleSummeForUnexpectedCase() {
        ArrayWorker worker = new ArrayWorker();
        int[] array = {};
        int sum = worker.minimaleSumme(array);
        assertEquals(-1, sum);
    }
}
