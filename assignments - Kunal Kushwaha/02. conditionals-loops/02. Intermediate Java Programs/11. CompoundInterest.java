// Compound Interest
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = input.nextInt();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double ratePerPeriod = (annualInterestRate/100) / compoundFrequency;
        int totalCompounds = compoundFrequency * years;

        double compoundInterest = principal * Math.pow(1 + ratePerPeriod, totalCompounds) - principal;

        System.out.println("Compound Interest: $" + compoundInterest);
    }
}

