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

        assertArrayEquals(erwarteteNichtAusreichende, result);
    }

    @Test
    public void testDurchschnittswert() {
        int[] noten = {84, 29, 43, 60, 38};
        double erwarteterDurchschnitt = (84 + 29 + 43 + 60 + 38) / 5.0;

        double result = NotenProzessor.durchschnittswert(noten);

        assertEquals(erwarteterDurchschnitt, result);
    }

    @Test
    public void testAbgerundeteNoten() {
        int[] noten = {84, 29, 43, 60, 38};
        int[] erwarteteAbgerundete = {85, 29, 45, 60, 40};

        int[] result = NotenProzessor.abgerundeteNoten(noten);

        assertArrayEquals(erwarteteAbgerundete, result);
    }

    @Test
    public void testMaximaleAbgerundeteNote() {
        int[] noten = {84, 29, 43, 60, 38};
        int erwarteteMaxAbgerundet = 85; // Max abgerundete Note in den gegebenen Noten

        int result = NotenProzessor.maximaleAbgerundeteNote(noten);

        assertEquals(erwarteteMaxAbgerundet, result);
    }
}
