// Calculate CGPA

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numberOfCourses = input.nextInt();

        double totalGradePoints = 0;
        int totalCreditHours = 0;

        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.println("Enter details for Course " + i + ":");

            System.out.print("Enter grade points for Course " + i + ": ");
            float gradePoints = input.nextFloat();

            System.out.print("Enter credit hours for Course " + i + ": ");
            int creditHours = input.nextInt();

            totalGradePoints += gradePoints * creditHours;
            totalCreditHours += creditHours;
        }

        double cgpa = totalGradePoints / totalCreditHours;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("CGPA: " + df.format(cgpa));
    }
}
