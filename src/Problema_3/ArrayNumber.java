package Problema_3;

public class ArrayNumber {
    private int[] number;

    public ArrayNumber(int[] number) {
        this.number = number;
    }

    public int[] add(ArrayNumber other) {
        int n = this.number.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = this.number[i] + other.number[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        } else {
            return result;
        }
    }

    public int[] subtract(ArrayNumber other) {
        int n = this.number.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = this.number[i] - other.number[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        // Determine the sign of the result
        boolean isNegative = false;
        if (borrow > 0) {
            isNegative = true;
        }

        // Remove leading zeros from the result
        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < n && result[firstNonZeroIndex] == 0) {
            firstNonZeroIndex++;
        }

        // If all digits are zeros, return a single zero
        if (firstNonZeroIndex == n) {
            return new int[]{0};
        }

        // Create the final result array with or without the negative sign
        int[] finalResult = new int[n - firstNonZeroIndex];
        System.arraycopy(result, firstNonZeroIndex, finalResult, 0, n - firstNonZeroIndex);

        if (isNegative) {
            // If the result is negative, add a negative sign to the front
            finalResult = addNegativeSign(finalResult);
        }

        return finalResult;
    }

    // Helper method to add a negative sign to the result
    private int[] addNegativeSign(int[] result) {
        int[] resultWithSign = new int[result.length + 1];
        resultWithSign[0] = -1; // -1 represents a negative sign
        System.arraycopy(result, 0, resultWithSign, 1, result.length);
        return resultWithSign;
    }
}
