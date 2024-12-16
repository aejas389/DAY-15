import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        int PRICE_MOUSE = 150;
        int PRICE_KEYBOARD = 200;
        int PRICE_MONITOR = 20000;
        int PRICE_CPU = 10000;
        int PRICE_SPEAKERS = 500;
        int PRICE_MOBILE = 18000;
        int PRICE_EARPHONES = 2000;
        int PRICE_LAPTOP = 50000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of Mice: ");
        int quantityMouse = scanner.nextInt();
        System.out.print("Enter quantity of Keyboards: ");
        int quantityKeyboard = scanner.nextInt();
        System.out.print("Enter quantity of Monitors: ");
        int quantityMonitor = scanner.nextInt();
        System.out.print("Enter quantity of CPUs: ");
        int quantityCPU = scanner.nextInt();
        System.out.print("Enter quantity of Speakers: ");
        int quantitySpeakers = scanner.nextInt();
        System.out.print("Enter quantity of Mobiles: ");
        int quantityMobile = scanner.nextInt();
        System.out.print("Enter quantity of Earphones: ");
        int quantityEarphones = scanner.nextInt();
        System.out.print("Enter quantity of Laptops: ");
        int quantityLaptop = scanner.nextInt();
        int totalMouse = PRICE_MOUSE * quantityMouse;
        int totalKeyboard = PRICE_KEYBOARD * quantityKeyboard;
        int totalMonitor = PRICE_MONITOR * quantityMonitor;
        int totalCPU = PRICE_CPU * quantityCPU;
        int totalSpeakers = PRICE_SPEAKERS * quantitySpeakers;
        int totalMobile = PRICE_MOBILE * quantityMobile;
        int totalEarphones = PRICE_EARPHONES * quantityEarphones;
        int totalLaptop = PRICE_LAPTOP * quantityLaptop;
        int totalSelectedItems = totalMouse + totalKeyboard + totalMonitor + totalCPU + totalSpeakers + totalMobile + totalEarphones + totalLaptop;
        System.out.print("Enter number of distinct products added to the cart (2 or 3): ");
        int numberOfProducts = scanner.nextInt();
        double finalAmount;
        if (numberOfProducts == 3) {
            finalAmount = totalSelectedItems * 0.9;
            System.out.println("10% discount applied.");
        } else if (numberOfProducts == 2) {
            finalAmount = totalSelectedItems;
            System.out.println("No discount applied.");
        } else {
            System.out.println("Invalid input for number of products. No discount applied.");
            finalAmount = totalSelectedItems;
        }
        System.out.println("\n--- Shopping Bill ---");
        System.out.println("Mice: " + quantityMouse + " x " + PRICE_MOUSE + " = " + totalMouse);
        System.out.println("Keyboards: " + quantityKeyboard + " x " + PRICE_KEYBOARD + " = " + totalKeyboard);
        System.out.println("Monitors: " + quantityMonitor + " x " + PRICE_MONITOR + " = " + totalMonitor);
        System.out.println("CPUs: " + quantityCPU + " x " + PRICE_CPU + " = " + totalCPU);
        System.out.println("Speakers: " + quantitySpeakers + " x " + PRICE_SPEAKERS + " = " + totalSpeakers);
        System.out.println("Mobiles: " + quantityMobile + " x " + PRICE_MOBILE + " = " + totalMobile);
        System.out.println("Earphones: " + quantityEarphones + " x " + PRICE_EARPHONES + " = " + totalEarphones);
        System.out.println("Laptops: " + quantityLaptop + " x " + PRICE_LAPTOP + " = " + totalLaptop);
        System.out.println("------------------------");
        System.out.printf("Final Amount: %.2f\n", finalAmount);

    }
}
