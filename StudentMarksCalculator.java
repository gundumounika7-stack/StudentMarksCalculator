import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Marks Calculator =====");

        // Input student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Input marks for 5 subjects
        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        // Calculate total and percentage
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 5.0);

        // Calculate grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("\n===== Result =====");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
    }
}
