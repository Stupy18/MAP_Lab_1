public class NotenProzessor {

    // Methode zur Ermittlung von nicht ausreichenden Noten
    public static int[] nichtAusreichendeNoten(int[] noten) {
        int[] nichtAusreichende = new int[noten.length];
        int index = 0;

        for (int note : noten) {
            if (note < 40) {
                nichtAusreichende[index] = note;
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(nichtAusreichende, 0, result, 0, index);

        return result;
    }

    // Methode zur Berechnung des Durchschnitts
    public static double durchschnittswert(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int note : noten) {
            sum += note;
        }

        return (double) sum / noten.length;
    }

    // Methode zur Abrundung der Noten
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundet = new int[noten.length];

        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note < 38 || note % 5 < 3) {
                abgerundet[i] = note;
            } else {
                abgerundet[i] = ((note / 5) + 1) * 5;
            }
        }

        return abgerundet;
    }

    // Methode zur Ermittlung der maximalen abgerundeten Note
    public static int maximaleAbgerundeteNote(int[] noten) {
        int maxAbgerundet = Integer.MIN_VALUE;

        for (int note : noten) {
            int abgerundet = abgerundeteNote(note);
            if (abgerundet > maxAbgerundet) {
                maxAbgerundet = abgerundet;
            }
        }

        return maxAbgerundet;
    }

    private static int abgerundeteNote(int note) {
        if (note < 38 || note % 5 < 3) {
            return note;
        } else {
            return ((note / 5) + 1) * 5;
        }
    }
}