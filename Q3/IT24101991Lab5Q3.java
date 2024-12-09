import java.util.Scanner;

public class IT24101991Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int DISCOUNT_10_DAYS = 3;
        final int DISCOUNT_20_DAYS = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation
        if (startDate < 1 || endDate > 31 || startDate >= endDate) {
            System.out.println("Invalid input! Please check the start and end dates.");
            return;
        }

        int reservedDays = endDate - startDate;

        // Determine the discount rate
        double discountRate = 0;
        if (reservedDays > DISCOUNT_20_DAYS) {
            discountRate = 0.20;
        } else if (reservedDays >= DISCOUNT_10_DAYS) {
            discountRate = 0.10;
        }

        // Calculate total cost
        double totalCost = reservedDays * ROOM_CHARGE_PER_DAY * (1 - discountRate);

        // Display details
        System.out.println("Room charges per day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("Days reserved: " + reservedDays);
        System.out.printf("Total amount to be paid: Rs. %.2f%n", totalCost);
    }
}
