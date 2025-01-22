import java.util.*;
public class GradeCalculatorApp 
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();
        System.out.println("Welcome to the Student Grade Calculator!");
        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. Display Student Grades");
            System.out.println("4. Display Student Average");
            System.out.println("5. Calculate Class Average");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); //  newline
            switch (choice)
            {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentID = sc.nextLine();
                    gradeCalculator.addStudent(name, studentID);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String idForGrade = sc.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = sc.nextDouble();
                    gradeCalculator.addGradeToStudent(idForGrade, grade);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    String idForGrades = sc.nextLine();
                    gradeCalculator.displayStudentGrades(idForGrades);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    String idForAverage = sc.nextLine();
                    gradeCalculator.displayStudentAverage(idForAverage);
                    break;
                case 5:
                    gradeCalculator.calculateClassAverage();
                    break;
                case 6:
                    System.out.println("Thank you for using the Student Grade Calculator. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
