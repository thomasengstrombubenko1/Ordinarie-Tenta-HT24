import java.util.ArrayList;

public class Course {
    private String courseName;
    private int credits;
    private ArrayList<Student> students = new ArrayList<>();

    public Course() {
    }

    public Course(String name) {
        this.courseName = name;
    }

    public void addStudent(Student stu) {
        students.add(stu);
    }

    public void increaseCredits(int c) {
        credits += c;
    }

    public void print() {
        System.out.println("Course: " + courseName);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getCredits() {
        return credits;
    }
}