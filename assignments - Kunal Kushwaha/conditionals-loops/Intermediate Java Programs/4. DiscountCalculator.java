// Calculate the discount of the product

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter the discount rate (%): ");
        double discountRate = input.nextDouble();

        double discountAmount = (originalPrice * discountRate) / 100;

        double discountedPrice = originalPrice - discountAmount;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}

