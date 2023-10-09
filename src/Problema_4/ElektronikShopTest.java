package Problema_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ElektronikShopTest {

    @Test
    public void testFindCheapestKeyboardForExpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {15, 20, 10, 35};
        int maxBudget = 30;
        int cheapestKeyboard = shop.findCheapestKeyboard(keyboards, maxBudget);
        assertEquals(10, cheapestKeyboard);
    }

    @Test
    public void testFindCheapestKeyboardForUnexpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {40, 50, 60};
        int maxBudget = 30;
        int cheapestKeyboard = shop.findCheapestKeyboard(keyboards, maxBudget);
        assertEquals(-1, cheapestKeyboard);
    }

    @Test
    public void testFindMostExpensiveItemForExpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int mostExpensiveItem = shop.findMostExpensiveItem(keyboards, usbDrives);
        assertEquals(40, mostExpensiveItem);
    }

    @Test
    public void testFindMostExpensiveItemForUnexpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {};
        int[] usbDrives = {};
        int mostExpensiveItem = shop.findMostExpensiveItem(keyboards, usbDrives);
        assertEquals(-1, mostExpensiveItem);
    }

    @Test
    public void testFindMostExpensiveUsbDriveForExpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] usbDrives = {15, 45, 20};
        int maxBudget = 30;
        int mostExpensiveUsbDrive = shop.findMostExpensiveUsbDrive(usbDrives, maxBudget);
        assertEquals(20, mostExpensiveUsbDrive);
    }

    @Test
    public void testFindMostExpensiveUsbDriveForUnexpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] usbDrives = {15, 45, 20};
        int maxBudget = 10; // Set a maxBudget where no USB drive can be purchased
        int mostExpensiveUsbDrive = shop.findMostExpensiveUsbDrive(usbDrives, maxBudget);
        assertEquals(-1, mostExpensiveUsbDrive); // Use a different value for unexpected case
    }


    @Test
    public void testCalculateTotalSpentForExpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int maxBudget = 60;
        int maxSpent = shop.calculateTotalSpent(maxBudget, keyboards, usbDrives);
        assertEquals(58, maxSpent);
    }

    @Test
    public void testCalculateTotalSpentForUnexpectedCase() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int maxBudget = 10;
        int maxSpent = shop.calculateTotalSpent(maxBudget, keyboards, usbDrives);
        assertEquals(-1, maxSpent);
    }
}

