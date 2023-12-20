// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int low = input.nextInt();
        System.out.println("Enter the upper limit : ");
        int high = input.nextInt();
        System.out.println("The armstrong numbers between " + low + " & " + high + " :");

        for (int i=low; i<=high; i++) {
            int temp = i;
            int count = String.valueOf(temp).length();
            double armstrong = 0;

            while (temp != 0) {
                int num = temp % 10;
                armstrong = Math.pow(num, count) + armstrong;
                temp = temp / 10;
            }

            if (armstrong == i) {
                System.out.println(i);
            }
        }
    }
}