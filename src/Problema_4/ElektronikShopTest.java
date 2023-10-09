package Problema_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ElektronikShopTest {

    @Test
    public void testFindCheapestKeyboard() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {15, 20, 10, 35};
        int maxBudget = 30;
        int cheapestKeyboard = shop.findCheapestKeyboard(keyboards, maxBudget);
        assertEquals(15, cheapestKeyboard);
        assertEquals(10, cheapestKeyboard);
    }

    @Test
    public void testFindMostExpensiveItem() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int mostExpensiveItem = shop.findMostExpensiveItem(keyboards, usbDrives);
        assertEquals(40, mostExpensiveItem);
        assertEquals(35, mostExpensiveItem);
    }

    @Test
    public void testFindMostExpensiveUsbDrive() {
        ElektronikShop shop = new ElektronikShop();
        int[] usbDrives = {15, 45, 20};
        int maxBudget = 30;
        int mostExpensiveUsbDrive = shop.findMostExpensiveUsbDrive(usbDrives, maxBudget);
        assertEquals(20, mostExpensiveUsbDrive);
        assertEquals(45, mostExpensiveUsbDrive);
    }

    @Test
    public void testCalculateTotalSpent() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int maxBudget = 60;
        int maxSpent = shop.calculateTotalSpent(maxBudget, keyboards, usbDrives);
        assertEquals(58, maxSpent);
        assertEquals(60, maxSpent);
    }
}

