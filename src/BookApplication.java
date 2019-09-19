/*
 * Create another class called BookApp which contains the main method. I
 * In the main method you shall create an instance of a Book and print the Author, Title and Description.
 */

import java.util.Scanner;

public class BookApplication {
    public static void main(String args[]) {

        Book book = new Book();
        book.setTitle("Introduction to Java Spring Boot: Learning By Coding");
        book.setAuthor("Henley, Wolf, Ankomah, Lee, Phimphachanh");
        book.setDescription("This book is a beginners guide to Spring Boot 2.0.");
        book.setPrice(21.00);
        book.setInStock(true);

        System.out.println("Book 1:");
        System.out.println(book.getDisplayText());
        System.out.println();

        Book book2 = new Book("How to write a resume", "John Doe",
                    "Guide to writing a resume with examples", 9.99, false);
        System.out.println("Book 2:");
        System.out.println(book2.getDisplayText());


        Scanner keybd = new Scanner(System.in);
        int count;

        System.out.println("Enter a number of the first book: ");
        count = keybd.nextInt();
        keybd.nextLine();

        System.out.println(book.computePrice(count));

        System.out.println("Enter a number of the second book: ");
        count = keybd.nextInt();
        keybd.nextLine();

        System.out.println(book2.computePrice(count));




    }
}
