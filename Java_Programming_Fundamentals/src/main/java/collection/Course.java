package collection;

public class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }

}
