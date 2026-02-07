class CourseService {

    void printFinalResult(Course c) {
        c.displayCourseInfo();
        System.out.println("Final Marks: " + c.calculateFinalMarks());
    }
}
