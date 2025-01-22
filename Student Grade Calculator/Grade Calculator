import java.util.ArrayList;
public class GradeCalculator 
{
    private ArrayList<Student> students;
    public GradeCalculator() 
    {
        students = new ArrayList<>();
    }

    public void addStudent(String name, String studentID)
    {
        Student student = new Student(name, studentID);
        students.add(student);
        System.out.println("Student added: " + name + " (ID: " + studentID + ")");
    }

    public void addGradeToStudent(String studentID, double grade)
    {
        Student student = findStudent(studentID);
        if (student != null) 
        {
            student.addGrade(grade);
        } else
        {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    public void displayStudentGrades(String studentID)
    {
        Student student = findStudent(studentID);
        if (student != null) 
        {
            student.displayGrades();
        } else
        {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    public void displayStudentAverage(String studentID) 
    {
        Student student = findStudent(studentID);
        if (student != null) 
        {
            System.out.println("Average grade for " + student.getName() + ": " + student.calculateAverage());
            System.out.println(student.hasPassed() ? "Status: Passed" : "Status: Failed");
        } else
        {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    public void calculateClassAverage()
    {
        if (students.isEmpty())
        {
            System.out.println("No students in the class.");
            return;
        }
        double totalSum = 0;
        int totalGrades = 0;

        for (Student student : students)
        {
            for (double grade : student.getGrades())
            { // Access grades using the getter
                totalSum += grade;
                totalGrades++;
            }
        }

        if (totalGrades > 0) 
        {
            double classAverage = totalSum / totalGrades;
            System.out.println("Class average grade: " + classAverage);
        } else
        {
            System.out.println("No grades available to calculate the class average.");
        }
    }

    private Student findStudent(String studentID) 
    {
        for (Student student : students)
        {
            if (student.getStudentID().equals(studentID))
            {
                return student;
            }
        }
        return null;
    }
}
