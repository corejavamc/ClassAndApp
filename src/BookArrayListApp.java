import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayListApp {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<Book>();

        String answer = "y";
        //add a new book
        //create a book from our object
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Do you want to enter a book?");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                Book book = new Book();
                System.out.print("Enter the author:");
                book.setAuthor(keyboard.nextLine());
                System.out.print("Enter the title: ");
                book.setTitle(keyboard.nextLine());
                booklist.add(book);
            }
        }

        //print all the books in the array list
        System.out.println("All the books:");

        //enhanced for loop allows you to simplify code by with a for-loops
        //that visit each element of an array/collection easily (without using indexes)
        //Example: https://blogs.oracle.com/corejavatechtips/using-enhanced-for-loops-with-your-classes
        for(Book book:booklist)
        {
            System.out.print(book.getAuthor());
            System.out.print(" ");
            System.out.print(book.getTitle());
            System.out.println();
        }

    }

}
