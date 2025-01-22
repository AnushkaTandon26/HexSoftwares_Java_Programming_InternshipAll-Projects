import java.util.ArrayList;
public class Student
{
    private String name;
    private String studentID;
    private ArrayList<Double> grades;
    public Student(String name, String studentID)
    {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public void addGrade(double grade) 
    {
        if (grade >= 0 && grade <= 100)
        {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }

    public double calculateAverage()
    {
        if (grades.isEmpty())
        {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades)
        {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayGrades()
    {
        System.out.println("Grades for " + name + " (" + studentID + "):");
        for (double grade : grades)
        {
            System.out.println(grade);
        }
    }

    public boolean hasPassed() 
    {
        return calculateAverage() >= 50;
    }

    public ArrayList<Double> getGrades() 
    {
        return grades; // Public getter for the grades list
    }
}
