import java.util.ArrayList;

public class Exam {
    public static void a() {
        Student s1 = new Student();
        s1.setName("Mary");
        String name = s1.getName();
        String id = s1.getId();
        s1.print();
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        Student s2 = new Student("1", "Gary");
        String name2 = s2.getName();
        String id2 = s2.getId();
        s2.print();
        System.out.println("Name: " + name2);
        System.out.println("ID: " + id2);
        Course c1 = new Course("Java");
        c1.print();
        ExamUtils.method1(s1, c1);
        ArrayList<Student> s = c1.getStudents();
        int i = s.size();
        System.out.println("i: " + i);
    }

    public static void b() {
        Student s1 = new Student("1", "Gary");
        Student s2 = s1;
        s2.setId("99");
        String id1 = s1.getId();
        String id2 = s2.getId();
        System.out.println("id1: " + id1);
        System.out.println("id2: " + id2);
        Course c1 = new Course("UML");

        ExamUtils.method3(c1);
        int i = c1.getCredits();
        System.out.println("i: " + i);
        ArrayList<Student> stud = ExamUtils.method4();
        int j = stud.size();
        System.out.println("j: " + j);
    }

    public static void c() {
        int grade = 85;
        switch (grade) {
            case 100:
                System.out.println("Perfect Score");
                break;
            case 90:
                System.out.println("Excellent");
                break;
            case 80:
                System.out.println("Good");
                break;
            default:
                System.out.println("Keep Trying");
        }
        String city = "Lund";
        String str = null;
        if (city != null) {
            System.out.println("City is set");
        }
        if (city.equals("Lund") && grade >= 80) {
            str = "Eligible for Scholarship";
        } else if (city.equals("Lund") || grade >= 80) {
            str = "Considered for Scholarship";
        } else {
            str = "Not Eligible for Scholarship";
        }
        System.out.println("str: " + str);
    }

    public static void d() {
        for (int i = 5; i < 8; i++) {

            System.out.println("i: " + i);
        }
        System.out.println("----");
        int j = 3;
        while (j > 0) {
            System.out.println("j: " + j);
            j--;
        }
        System.out.println("----");
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("1", "Mary");
        Student s2 = new Student("2", "Gary");
        Student s3 = new Student("3", "Ham");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Student s4 = students.get(1);
        s4.print();
        students.remove(s2);
        int k = students.size();
        System.out.println("k: " + k);
        Student s5 = students.get(1);
        s5.print();
        students.clear();
        int m = students.size();
        System.out.println("m: " + m);
    }
}