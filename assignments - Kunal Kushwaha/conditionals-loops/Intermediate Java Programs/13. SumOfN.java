// Sum of N numbers

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = input.nextInt();
        int sum = 0;

        for(int i=0; i<=num; i++){
                sum += i;
        }

        System.out.println("Sum of the first " + num + " natural numbers: " + sum);
    }
}
