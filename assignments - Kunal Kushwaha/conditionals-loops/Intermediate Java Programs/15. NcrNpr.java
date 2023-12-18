// Find Ncr & Npr

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = input.nextInt();
        System.out.println("Enter the value of r :");
        int r = input.nextInt();

        if(n>=r && r>=0){
        int nFactorial = 1;
        for(int i=1; i<=n; i++){
            nFactorial *= i;
        }

        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        int nMinusRFactorial = 1;
        for (int i = 1; i <= n-r; i++) {
            nMinusRFactorial *= i;
        }

        int nCrResult = nFactorial / (rFactorial * nMinusRFactorial);
        int nPrResult = nFactorial / nMinusRFactorial;

        System.out.println("nCr("+n+","+r+") = "+nCrResult);
        System.out.println("nPr("+n+","+r+") = "+nPrResult);
        }
        else{
            System.out.println("Invalid Input.");
        }
    }
}