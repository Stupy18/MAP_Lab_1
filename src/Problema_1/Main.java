package Problema_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[]{10, 54, 30, 39, 47, 48, 60, 88};
        int[] noten2 = new int[]{29};

        System.out.println(notenProzessor.maximaleAbgerundeteNote(noten));
        System.out.println(notenProzessor.maximaleAbgerundeteNote(noten2));
    }
}
