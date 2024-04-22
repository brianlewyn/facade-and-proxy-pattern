import java.lang.reflect.Proxy;
import java.util.HashMap;

public class Main {
    private static HashMap<String,ICourse> courseDB = new HashMap<String,ICourse>();

    public static void initializeDB() {
        Course course;

        course = new Course();
        
        course.setIdCourse(1);
        course.setTitle("Java Programming");
        course.setLevel("Beginner");
        course.setLanguage("English");
        course.setDescription("Java Programming for Beginners");
        course.setPrerequisites("Basic Programming Knowledge");
        course.setCertificate("Java Programming Certificate");
        course.setContent("Java Programming Content");
        course.setVideo("Java Programming Video");

        courseDB.put("Java Programming", course);

        course = new Course();

        course.setIdCourse(2);
        course.setTitle("Python Programming");
        course.setLevel("Beginner");
        course.setLanguage("English");
        course.setDescription("Python Programming for Beginners");
        course.setPrerequisites("Basic Programming Knowledge");
        course.setCertificate("Python Programming Certificate");
        course.setContent("Python Programming Content");
        course.setVideo("Python Programming Video");

        courseDB.put("Python Programming", course);

        course = new Course();

        course.setIdCourse(3);
        course.setTitle("C Programming");
        course.setLevel("Advanced");
        course.setLanguage("English");
        course.setDescription("C Programming for Advanced Users");
        course.setPrerequisites("Intermediate Programming Knowledge");
        course.setCertificate("C Programming Certificate");
        course.setContent("C Programming Content");
        course.setVideo("C Programming Video");

        courseDB.put("C Programming", course);
    }

    public static ICourse getGuestProxy(ICourse course) {
        return (ICourse) Proxy.newProxyInstance(
            	course.getClass().getClassLoader(),
            	course.getClass().getInterfaces(),
                new Guest(course));
    }

    public static ICourse getStudentProxy(ICourse course) {
        return (ICourse) Proxy.newProxyInstance(
            	course.getClass().getClassLoader(),
            	course.getClass().getInterfaces(),
                new Student(course));
    }

    public static ICourse getProfessorProxy(ICourse course) {
        return (ICourse) Proxy.newProxyInstance(
            	course.getClass().getClassLoader(),
            	course.getClass().getInterfaces(),
                new Professor(course));
    }

    public static ICourse getAdminProxy(ICourse course) {
        return (ICourse) Proxy.newProxyInstance(
            	course.getClass().getClassLoader(),
            	course.getClass().getInterfaces(),
                new Admin(course));
    }

    public static void main(String[] args) {
        ICourse course;

        initializeDB();

        // ============================== Guest ==============================

        System.out.println("# User is a guest\n");

        course = courseDB.get("Java Programming");
        ICourse guest = getGuestProxy(course);

        guest.showCourseSummary();
        // System.out.println("Title: " + guest.getTitle() + "\n");
        // System.out.println("Level: " + guest.getLevel());
        // System.out.println("Language: " + guest.getLanguage());
        // System.out.println("Description: " + guest.getDescription());
        // System.out.println("Prerequisites: " + guest.getPrerequisites());

        try {
            guest.showCourseDetails();
            // System.out.println("Certificate: " + guest.getCertificate());
            // System.out.println("Content: " + guest.getContent());
            // System.out.println("Video: " + guest.getVideo());

        } catch (Exception e) {
            System.out.println("Run showCourseDetails() method");
            System.out.println("You must be a student to see the course details\n");
        }

        // ============================== Student ==============================

        System.out.println("# User is a student\n");

        course = courseDB.get("Python Programming");
        ICourse student = getStudentProxy(course);

        student.downloadCertificate();
        // student.downloadContent();
        // student.downloadVideo();

        try {
            student.setTitle("Python is the best programming language");
            // student.setLevel("Advanced");
            // student.setLanguage("Spanish");
            // student.setDescription("Python Programming for Advanced Users");
            // student.setPrerequisites("Intermediate Programming Knowledge");

        } catch (Exception e) {
            System.out.println("Title ramains: " + student.getTitle());
            System.out.println("You must be a professor to change the course title\n");
        }

        // ============================== Professor ==============================

        System.out.println("# User is a professor\n");

        course = courseDB.get("C Programming");
        ICourse professor = getProfessorProxy(course);

        professor.setVideo("C Programming Video Updated\n");
        System.out.println("Video changed to: " + professor.getVideo());

        // professor.setTitle("C Programming for Advanced Users");
        // professor.setLevel("Advanced");
        // professor.setLanguage("Spanish");
        // professor.setDescription("C Programming for Advanced Users");
        // professor.setPrerequisites("Intermediate Programming Knowledge");

        try {
            professor.downloadContent();
            // professor.downloadCertificate();
            // professor.downloadVideo();

        } catch (Exception e) {
            System.out.println("Run downloadContent() method");
            System.out.println("You must be a student or admin to download the course content\n");
        }

        // ============================== Admin ==============================

        System.out.println("# User is an admin\n");

        course = courseDB.get("Java Programming");
        ICourse admin = getAdminProxy(course);

        admin.showCourseSummary();
        admin.showCourseDetails();
    }
}
