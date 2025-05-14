import java.util.Scanner;

public class StudentGradeCalculatorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        // Input marks and calculate total
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        // Calculate average
        float average = (float) total / n;

        
        String grade;
        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "F";

        // Display result
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
