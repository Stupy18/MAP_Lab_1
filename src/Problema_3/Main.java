package Problema_3;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {5,5,5,5};
        int[] num2 = {5,4,4,4};
        ArrayNumber arrayNumber1 = new ArrayNumber(num1);
        ArrayNumber arrayNumber2 = new ArrayNumber(num2);
        int[] sum = arrayNumber1.add(arrayNumber2);
        int[] diff = arrayNumber1.subtract(arrayNumber2);

        System.out.print("Summe: ");
        for (int digit : sum) {
            System.out.print(digit);

        }

        System.out.println();


        System.out.print("Differenz: ");
        for (int digit : diff) {
            System.out.print(digit);

        }
    }
}
