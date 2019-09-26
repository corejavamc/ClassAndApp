import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {
    public static void main(String args[]) {
        ArrayList<Transcript> transcripts = new ArrayList<>();
        Transcript transcript;
        Course course;
        Scanner keybd = new Scanner(System.in);
        String userStr;
        int userInt, counter;
        double sum, gpa;

        System.out.println("Welcome!");
        while (true) {
            transcript = new Transcript();
            System.out.println("Enter student's name: ");
            userStr = keybd.nextLine();
            transcript.setName(userStr);

            System.out.println("Enter student's id: ");
            userStr = keybd.nextLine();
            transcript.setId(userStr);

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

                transcript.addCourse(course);

                System.out.println("Another course? (y/n)");
                userStr = keybd.nextLine();
                if (userStr.equalsIgnoreCase("n"))
                    break;

            }

            transcripts.add(transcript);

            System.out.println("Another transcript? (y/n)");
            userStr = keybd.nextLine();
            if (userStr.equalsIgnoreCase("n"))
                break;
        }



        for (Transcript onetrans : transcripts) {
            System.out.println("Student Information");
            System.out.println(onetrans.displayInfo());
            System.out.println("\nName\tNumber\tCredit\tGrade");

            for (Course one : onetrans.getCourses())
                System.out.println(one.displayText() + "\t\tGPA: " + one.convertGPA());

            System.out.println("\t\t" + onetrans.displayOverallGPA() + "\n");
        }

     }
}
