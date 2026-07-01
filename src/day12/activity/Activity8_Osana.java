// Activity 8: Grades Average Report Generator (Multi-Dimensional Array)
package day12.activity;

import java.util.Scanner;

public class Activity8_Osana {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner userInput = new Scanner(System.in);
        
        // Average Calculator menu layout
        System.out.println("======================================");
        System.out.println("          Average Calculator          ");
        System.out.println("======================================");
        
        // Prompt user for input sizes
        System.out.print("Enter number of students: ");
        int studentNum = userInput.nextInt();
        
        System.out.print("Enter number of subjects: ");
        int subjectCount = userInput.nextInt();
        
        // --- MULTI-DIMENSIONAL & SINGLE-DIMENSIONAL ARRAYS ---
        String[] subjectNames = new String[subjectCount];
        String[] studentNames = new String[studentNum];
        // Rows = students, Columns = subject grades
        int[][] grades = new int[studentNum][subjectCount]; 
        
        // Prompt user for subject names dynamically
        System.out.println("\nEnter subject names: ");
        for (int j = 0; j < subjectCount; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjectNames[j] = userInput.next();
        }
        
        // Prompt user for student data dynamically
        for (int i = 0; i < studentNum; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = userInput.next();
            
            System.out.println("Enter grades for each subject: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = userInput.nextInt();
            }
        }
        
        // Display the grades report in table form
        System.out.println("\n======================================");
        System.out.println("          Grades Report          ");
        System.out.println("======================================");

        // %-15s means a left-aligned string that takes exactly 15 spaces of width
        System.out.printf("%-15s", "Student");
        for (int j = 0; j < subjectCount; j++) {
            System.out.printf("%-12s", subjectNames[j]); // 12 spaces for each subject
        }
        System.out.println("Average");
        System.out.println("-----------------------------------------------------");

        // Print dynamic table rows
        for (int i = 0; i < studentNum; i++) {
            System.out.printf("%-15s", studentNames[i]); // Matches the student header width
            
            int totalGradeSum = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.printf("%-12d", grades[i][j]); // Matches the subject header width
                totalGradeSum += grades[i][j];
            }
            
            double average = (double) totalGradeSum / subjectCount;
            System.out.printf("%.2f\n", average); 
        }
        
        // Close Scanner object after use
        userInput.close();
    }
}
