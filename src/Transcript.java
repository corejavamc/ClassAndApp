/*
 * create a Transcript class with student's name, id, and ArrayList<Course> courses variables and
 * following methods:
 *       addCourse(Course)
 *       double getOverallGPA();
 */

import java.util.ArrayList;

public class Transcript {
    private String name;
    private String id;
    private ArrayList<Course> courses;

    public Transcript() {
        name = "";
        id = "";
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public double getOverallGPA() {
        int counter = 0;
        double sum = 0.0;
        double result = 0.0;

        for (Course one : getCourses()) {
            result = one.convertGPA();
            sum = sum + result;
            if (!one.getGrade().equalsIgnoreCase("p") &&
                !one.getGrade().equalsIgnoreCase("f"))
                counter++;
        }

        result = sum / counter;
        return result;
    }

    public String displayOverallGPA() {
        String result = "Overall GPA: " + getOverallGPA();

        return result;
    }

    public String displayInfo() {
        String result = "Name: " + getName() + "\nId: " + getId();
        return result;
    }
}
