// Future investment value

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter number of compounds per year: ");
        int numberOfCompoundsPerYear = input.nextInt();

        double futureValue = investmentAmount * Math.pow(1 + (annualInterestRate/100) /numberOfCompoundsPerYear,
                numberOfYears * numberOfCompoundsPerYear);

        System.out.printf("Future investment value: %.2f%n", futureValue);

    }
}
