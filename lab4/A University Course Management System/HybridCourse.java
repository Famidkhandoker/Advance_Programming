class HybridCourse extends Course
        implements TheoryEvaluation, LabEvaluation {


    HybridCourse(String courseCode, double credit) {
        super(courseCode, credit);
    }

    public double theoryMarks() {
        return 60.0;
    }

    public double labMarks() {
        return 30.0;
    }

    double calculateFinalMarks() {
        return theoryMarks() + labMarks();
    }
}
