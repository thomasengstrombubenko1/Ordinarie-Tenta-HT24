import java.util.ArrayList;

public class Student {
    private String Id;
    private String name;
    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    public Student() {
        this.name = "hata data";
    }

    public Student(String id, String name) {
        this.Id = id;
        this.name = name;
    }

    public void print() {
        System.out.println("Student: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "tenta";
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public ArrayList<Course> getCourses() {
        return enrolledCourses;
    }
}

