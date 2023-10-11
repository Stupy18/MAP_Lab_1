package Problema_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayNumberTest {

    @Test
    public void testAddExpectedCase() {
        ArrayNumber num1 = new ArrayNumber(new int[]{1, 2, 3});
        ArrayNumber num2 = new ArrayNumber(new int[]{4, 5, 6});
        int[] result = num1.add(num2);
        assertArrayEquals(new int[]{5, 7, 9}, result);
    }

    @Test
    public void testAddUnexpectedCase() {
        ArrayNumber num1 = new ArrayNumber(new int[]{6, 2, 3});
        ArrayNumber num2 = new ArrayNumber(new int[]{4, 5, 6});
        int[] result = num1.add(num2);
        assertArrayEquals(new int[]{1,0, 7, 9}, result);
    }

    @Test
    public void testSubtractExpectedCase() {
        ArrayNumber num1 = new ArrayNumber(new int[]{6, 5, 4});
        ArrayNumber num2 = new ArrayNumber(new int[]{1, 2, 3});
        int[] result = num1.subtract(num2);
        assertArrayEquals(new int[]{5, 3, 1}, result);
    }

    @Test
    void testSubtractUnexpectedCase() {
        ArrayNumber num1 = new ArrayNumber(new int[]{6, 5, 4});
        ArrayNumber num2 = new ArrayNumber(new int[]{7, 2, 3});
        int[] result = num1.subtract(num2);
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    public void testMultiplyExpectedCase() {
        ArrayNumber num = new ArrayNumber(new int[]{1, 2, 3});
        int factor = 2;
        int[] result = num.multiply(factor);
        assertArrayEquals(new int[]{2, 4, 6}, result);
    }

    @Test
    public void testMultiplyUnexpectedCase() {
        ArrayNumber num = new ArrayNumber(new int[]{1, 2, 3});
        int factor = 11;
        int[] result = num.multiply(factor);
        assertArrayEquals(new int[]{1,3,5,3}, result);
    }

    @Test
    public void testDivideExpectedCase() {
        ArrayNumber num = new ArrayNumber(new int[]{9, 0, 6});
        int divisor = 3;
        int[] result = num.divide(divisor);
        assertArrayEquals(new int[]{3, 0, 2}, result);
    }

    @Test
    public void testDivideUnexpectedCase() {
        ArrayNumber num = new ArrayNumber(new int[]{1, 2, 3});
        int divisor = 0;
        int[] result = num.divide(divisor);
        assertArrayEquals(new int[]{-1}, result);
    }
}
