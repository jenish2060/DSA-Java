// Calculate Average Marks

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = input.nextInt();

        float totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            float marks = input.nextFloat();
            totalMarks += marks;
        }
        float averageMarks = totalMarks / numberOfSubjects;

        System.out.println("Average Marks: " + averageMarks);
    }
}
