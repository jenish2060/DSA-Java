// Calculate the depreciation value

import java.util.Scanner;

public class DepreciationValue {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter initial value of the asset: ");
            double initialValue = input.nextDouble();

            System.out.print("Enter salvage value of the asset: ");
            double salvageValue = input.nextDouble();

            System.out.print("Enter life of the asset (in years): ");
            int usefulLife = input.nextInt();

            double depreciationPerYear = (initialValue - salvageValue) / usefulLife;

            System.out.println("Depreciation per year: NPR " + depreciationPerYear);
        }
}

