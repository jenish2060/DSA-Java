// Calculate the batting average

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total runs scored: ");
        int totalRuns = input.nextInt();

        System.out.print("Enter total innings played: ");
        int totalInnings = input.nextInt();

        float battingAverage = (float) totalRuns / totalInnings;

        System.out.println("Batting Average: " + battingAverage);

    }
}
