// Input currency in rupees and output in USD.

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in NPR : ");
        DecimalFormat df = new DecimalFormat("#.####");
        float NPR = input.nextFloat();
        double USD = NPR * 0.0075;
        System.out.println( NPR + " NPR : " + df.format(USD) + " USD" );
    }
}
