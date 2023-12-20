// Calculate Electricity BIll

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total unit of power consumption : ");
        double unit = input.nextDouble();

        System.out.println("Enter the cost per unit : ");
        double cost = input.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");
        double electricBill = unit * cost;

        System.out.println("Electric Bill : NPR "+df.format(electricBill));
    }
}
