package Problema_4;

public class Main {
    public static void main(String[] args) {
        int[] keyboards = {15, 20, 55, 35};
        int[] usbDrives = {21, 19, 40, 25};
        int maxBudget = 30;

        ElektronikShop elektronikShop= new ElektronikShop();

        int cheapestKeyboard = elektronikShop.findCheapestKeyboard(keyboards, maxBudget);
        int mostExpensiveItem = elektronikShop.findMostExpensiveItem(keyboards, usbDrives);
        int mostExpensiveUsbDrive = elektronikShop.findMostExpensiveUsbDrive(usbDrives, maxBudget);
        int maxSpent = elektronikShop.calculateTotalSpent(maxBudget, keyboards, usbDrives);

        System.out.println("Die günstigste Tastatur kostet: $" + cheapestKeyboard);
        System.out.println("Das teuerste Element kostet: $" + mostExpensiveItem);
        System.out.println("Das teuerste USB-Laufwerk, das Markus kaufen kann, kostet: $" + mostExpensiveUsbDrive);
        System.out.println("Maximalbetrag, den Markus ausgeben wird: $" + maxSpent);

    }
}
