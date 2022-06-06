package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Course> courseList = new LinkedList<>();
        courseList.add(new Course("Java"));
        courseList.add(new Course("python"));
        courseList.add(new Course("Hibernate"));

        // Accessing the list of courses using iterator
        Iterator<Course> courseIterator = courseList.iterator();
        System.out.println("Using iterator to access the list of courses ");
        while (courseIterator.hasNext()) {
            Course course = courseIterator.next();
            System.out.println(course);
        }

        // Accessing the list of courses using for loop
        System.out.println("Using for loop to access the list of courses ");
        for (int index = 0; index < courseList.size(); index++) {
            System.out.println(courseList.get(index));
        }

        // Accessing the list of courses using enhanced for loop
        System.out.println("Using enhanced for loop to access the list of courses ");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
