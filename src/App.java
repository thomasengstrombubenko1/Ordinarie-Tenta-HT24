public class App {
    public static void main(String[] args) {
        System.out.println("-- Start --");
        System.out.println("A ---");
        Exam.a();
        System.out.println("B ---");
        b();
        System.out.println("C ---");
        c();
        System.out.println("D ---");
        d();
    }

    private static void a() {
        System.out.println("Running a()");
    }

    private static void b() {
        System.out.println("Running b()");
    }

    private static void c() {
        System.out.println("Running c()");
    }

    private static void d() {
        System.out.println("Running d()");
    }
}
