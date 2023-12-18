// Calculate Commission Percentage

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double salesAmount = input.nextDouble();

        System.out.print("Enter commission : ");
        double commission = input.nextDouble();

        double commissionRate = (commission/salesAmount)*100;

        System.out.println("Commission Rate: %" + commissionRate);
    }
}
