public class Main {
    public static void main(String[] args) {

        Course course = new HybridCourse("CSE-2201", 3.0);

        CourseService service = new CourseService();
        service.printFinalResult(course);
    }
}

//output
// Course Code: CSE-2201
// Credit: 3.0
// Final Marks: 90.0
