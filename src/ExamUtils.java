import java.util.ArrayList;

public class ExamUtils {
    public static void method1(Student s, Course c) {
        c.addStudent(s);
    }

    public static void method2(int i) {
        i += 10;
    }

    public static void method3(Course c) {
        c.increaseCredits(5);
    }

    public static ArrayList<Student> method4() {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("1", "Ham");
        Student s2 = new Student("2", "Sam");
        students.add(s1);
        students.add(s2);
        return new ArrayList<Student>();
    }

}
