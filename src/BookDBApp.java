import java.util.ArrayList;
import java.util.Scanner;

public class BookDBApp {
    public static void main(String args[]) {
        ArrayList<BookWithSku> booklist = new ArrayList<>();
        BookWithSku book;
        BookDB bookdb;

        book = new BookWithSku("Head First Java",
                "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, true, "Java1001");
        booklist.add(book);

        book = new BookWithSku("Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood",
                20.00, true, "Java1002");
        booklist.add(book);

        book = new BookWithSku("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place",
                45.00, true, "Orcl1003");
        booklist.add(book);

        book = new BookWithSku("Automate the Boring Stuff with Python",
                "Al Sweigart",
                "Fun with Python",
                10.50, true, "Python1004");
        booklist.add(book);

        book = new BookWithSku("The Maker's Guide to the Zombie Apocalypse",
                "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
                16.50, true, "Zombie1005");
        booklist.add(book);

        book = new BookWithSku("Raspberry Pi Projects for the Evil Genius",
                "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!",
                14.75, true, "Rasp1006");
        booklist.add(book);
        bookdb = new BookDB(booklist);

        Scanner keybd = new Scanner(System.in);
        String answer;

        while (true) {
            System.out.println("Enter a sku: ");
            answer = keybd.nextLine();
            book = bookdb.findBook(answer);
            if (book != null)
                System.out.println(book.displayText());
            else
                System.out.println("Book with SKU (" + answer + ") is not found.");

            System.out.println("\nWould you like to enter another sku? (y/n)");
            answer = keybd.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
