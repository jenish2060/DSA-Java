// Calculate average of n numbers

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of elements : ");
        int element = input.nextInt();
        int i;
        double sum=0;
        System.out.println("Enter the numbers : ");
        for(i=1 ; i<=element; i++){
            double num = input.nextDouble();
            sum = sum + num;
        }
        double average =sum/(i-1);
        System.out.println("The average of "+ (i-1) +" numbers is " + average);
    }
}
