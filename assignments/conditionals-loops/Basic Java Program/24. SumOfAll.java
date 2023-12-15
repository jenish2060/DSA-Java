// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum=0;
        System.out.println("Enter the integers you want to add : ");
        while(true){
            num = input.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("The sum is : "+sum);
    }
}
