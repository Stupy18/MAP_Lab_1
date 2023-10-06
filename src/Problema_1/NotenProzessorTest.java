package Problema_1;

import static org.junit.jupiter.api.Assertions.*;

import Problema_1.NotenProzessor;
import org.junit.jupiter.api.Test;

public class NotenProzessorTest {

    @Test
    public void testNichtAusreichendeNoten() {
        int[] noten = {84, 29, 43, 60, 38};
        int[] erwarteteNichtAusreichende = {29, 38};
        int[] result = NotenProzessor.nichtAusreichendeNoten(noten);
        assert noten[0] == result[0] : "Element at index 0 should be equal";
        assert noten[4] == result[1] : "Element at index 4 should be equal";
        assertArrayEquals(erwarteteNichtAusreichende, result);
    }

    @Test
    public void testDurchschnittswert() {
        int[] noten = {84, 29, 43, 60, 38};
        double erwarteterDurchschnitt = (84 + 29 + 43 + 60 + 38) / 5.0;
        assertEquals(erwarteterDurchschnitt, NotenProzessor.durchschnittswert(noten));
    }

    @Test
    public void testAbgerundeteNoten() {
        int[] noten = {84, 29, 43, 60, 38};
        int[] erwarteteAbgerundete = {85, 29, 45, 60, 38};
        int[] result = NotenProzessor.abgerundeteNoten(noten);
        assert noten[0] == result[0] : "Element at index 0 should be equal";
        assert noten[3] == result[3] : "Element at index 3 should be equal";
        assertArrayEquals(erwarteteAbgerundete, result);
    }

    @Test
    public void testMaximaleAbgerundeteNote() {
        int[] noten = {84, 29, 43, 60, 38};
        int erwarteteMaxAbgerundet = 85; // Max abgerundete Note in den gegebenen Noten
        assertEquals(erwarteteMaxAbgerundet, NotenProzessor.maximaleAbgerundeteNote(noten));
    }
}
