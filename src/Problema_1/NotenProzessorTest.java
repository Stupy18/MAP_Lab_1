package Problema_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotenProzessorTest {

    @Test
    public void testNichtAusreichendeNoten() {
        int[] noten = {45, 30, 55, 65, 25};
        int[] nichtAusreichende = NotenProzessor.nichtAusreichendeNoten(noten);
        assertArrayEquals(new int[]{30, 25}, nichtAusreichende);
    }

    @Test
    public void testDurchschnittswert() {
        int[] noten = {45, 30, 55, 65, 25};
        double durchschnitt = NotenProzessor.durchschnittswert(noten);
        assertEquals(44.0, durchschnitt, 0.01); // Allowing a small error due to double precision
    }

    @Test
    public void testDurchschnittswertEmptyArray() {
        int[] noten = {};
        double durchschnitt = NotenProzessor.durchschnittswert(noten);
        assertEquals(0.0, durchschnitt, 0.01);
    }

    @Test
    public void testAbgerundeteNoten() {
        int[] noten = {45, 30, 55, 65, 25};
        int[] abgerundet = NotenProzessor.abgerundeteNoten(noten);
        assertArrayEquals(new int[]{45, 30, 55, 65, 25}, abgerundet);
    }

    @Test
    public void testMaximaleAbgerundeteNoteExpectedCase() {
        int[] noten = {45, 30, 55, 65, 25};
        int maxAbgerundet = NotenProzessor.maximaleAbgerundeteNote(noten);
        assertEquals(65, maxAbgerundet);
    }

    @Test
    public void testMaximaleAbgerundeteNoteUnexpectedCase() {
        int[] noten = {};
        int maxAbgerundet = NotenProzessor.maximaleAbgerundeteNote(noten);
        assertEquals(Integer.MIN_VALUE, maxAbgerundet);
    }
}

