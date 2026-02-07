public class Main {
    public static void main(String[] args) {

        Course course = new HybridCourse("CSE-2201", 3.0);

        CourseService service = new CourseService();
        service.printFinalResult(course);
    }
}
