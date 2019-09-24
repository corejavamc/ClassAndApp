import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayListApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<Book>();

        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            /*
             * Ask user to continue or not
             */
            System.out.println("Do you want to enter a book?");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                /*
                 * add a new book
                 * i.e., create a book from our object and populate with user supplied information
                 */
                Book book = new Book();
                System.out.print("Enter the author:");
                book.setAuthor(keyboard.nextLine());
                System.out.print("Enter the title: ");
                book.setTitle(keyboard.nextLine());
                booklist.add(book);
            }
        }

        /*
         * Print all the books in the array list
         */
        System.out.println("All the books:");

        /*
         * Enhanced for loop allows you to simplify code by with a for-loops
         * that visit each element of an array/collection easily (without using indexes)
         * Example: https://blogs.oracle.com/corejavatechtips/using-enhanced-for-loops-with-your-classes
         */
        for(Book book:booklist)
        {
            /*
             * For each book in the booklist, print out author and title of the book
             */
            System.out.print(book.getAuthor());
            System.out.print(" ");
            System.out.print(book.getTitle());
            System.out.println();
        }

    }

}
