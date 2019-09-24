import java.util.ArrayList;
import java.util.Scanner;

public class CourseApp {
    public static void main(String args[]) {
        ArrayList<Course> courselist = new ArrayList<>();
        Course course;
        Scanner keybd = new Scanner(System.in);
        String userStr;
        int userInt;

        System.out.println("Welcome!");
        while (true) {
            course = new Course();
            System.out.println("Enter course name: ");
            userStr = keybd.nextLine();
            course.setName(userStr);

            System.out.println("Enter course number: ");
            userInt = keybd.nextInt();
            keybd.nextLine();
            course.setNumber(userInt);

            System.out.println("Enter credits: ");
            userInt = keybd.nextInt();
            keybd.nextLine();
            course.setCredit(userInt);

            System.out.println("Enter grade: ");
            userStr = keybd.nextLine();
            course.setGrade(userStr);

            courselist.add(course);

            System.out.println("Another course? (y/n)");
            userStr = keybd.nextLine();
            if (userStr.equalsIgnoreCase("n"))
                break;
        }

        System.out.println("Name\tNumber\tCredit\tGrade");
        for (Course one : courselist) {
            System.out.println(one.displayText() + "\t\tGPA: " + one.convertGPA());
        }
    }
}
