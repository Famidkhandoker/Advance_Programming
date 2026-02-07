abstract class Course {
    protected String courseCode;
    protected double credit;

    Course(String courseCode, double credit) {
        this.courseCode = courseCode;
        this.credit = credit;
    }

    abstract double calculateFinalMarks();

    void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit: " + credit);
    }
}

