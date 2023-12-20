// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers :");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int maxNum = maxNumber(firstNum,secondNum,thirdNum);
        int minNum = minNumber(firstNum,secondNum,thirdNum);
        System.out.println("Maximum Number : " + maxNum);
        System.out.println("Minimum Number : " + minNum);
    }

    static int maxNumber(int a, int b, int c){
        int max = a;
        if(b > max ){
            max=b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }

    static int minNumber(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
