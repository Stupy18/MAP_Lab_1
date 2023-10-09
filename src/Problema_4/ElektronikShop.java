package Problema_4;

public class ElektronikShop {
    public int findCheapestKeyboard(int[] keyboards, int maxBudget) {
        int cheapestKeyboard = -1; // Initialize with an invalid value

        for (int keyboardPrice : keyboards) {
            if (keyboardPrice <= maxBudget) {
                if (cheapestKeyboard == -1 || keyboardPrice < cheapestKeyboard) {
                    cheapestKeyboard = keyboardPrice;
                }
            }
        }

        return cheapestKeyboard;
    }

    public int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int mostExpensiveItem = -1;

        for (int keyboardPrice : keyboards) {
            if (keyboardPrice > mostExpensiveItem) {
                mostExpensiveItem = keyboardPrice;
            }
        }

        for (int usbPrice : usbDrives) {
            if (usbPrice > mostExpensiveItem) {
                mostExpensiveItem = usbPrice;
            }
        }

        return mostExpensiveItem;
    }

    public int findMostExpensiveUsbDrive(int[] usbDrives, int maxBudget) {
        int mostExpensiveUsbDrive = -1;

        for (int usbPrice : usbDrives) {
            if (usbPrice <= maxBudget) {
                if (mostExpensiveUsbDrive == -1 || usbPrice > mostExpensiveUsbDrive) {
                    mostExpensiveUsbDrive = usbPrice;
                }
            }
        }

        return mostExpensiveUsbDrive;
    }

    public int calculateTotalSpent(int maxBudget, int[] keyboards, int[] usbDrives) {
        int maxSpent = -1;

        for (int keyboardPrice : keyboards) {
            for (int usbPrice : usbDrives) {
                int total = keyboardPrice + usbPrice;
                if (total <= maxBudget && total > maxSpent) {
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }

}
