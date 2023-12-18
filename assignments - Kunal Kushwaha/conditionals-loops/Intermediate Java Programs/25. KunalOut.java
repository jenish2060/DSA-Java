/* Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the
number of days he can go out in the month of August. */

import java.util.Scanner;

public class KunalOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of days in August: ");
        int daysInAugust = input.nextInt();

        int countEvenDays = 0;

        for (int day = 2; day <= daysInAugust; day += 2) {
            countEvenDays++;
        }

        System.out.println("Kunal can go out on " + countEvenDays + " even days in August.");
    }
}
