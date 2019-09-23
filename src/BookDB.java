/*
 * A book database class will contain a method to return a book object.
 * We haven't exactly learned how to create a database or read/write to files yet.
 * We're going to use the knowledge we already have to create a class.
 * Our class will simulate a database and return a populated book object.
 * We'll simulate a database by simply using if or switch statements to look up a book based on SKU.
 * Later, we'll create a database using Oracle that also returns a book object.
 * Our book database will contain several book titles and the SKU code to look one up.
 *
 * Your assignment:
 * Create a class that contains a method that takes one parameter, the SKU, and
 * returns a corresponding book object. Use If Statements to populate the instance variables of the
 * Book class and return the populated Book class.
 */

import java.util.ArrayList;

public class BookDB {
    private ArrayList<BookWithSku> booklist;

    public BookDB() {
        booklist = new ArrayList<>();   // create an empty arraylist
    }

    public BookDB(ArrayList<BookWithSku> booklist) {
        this.booklist = booklist;
    }

    public ArrayList<BookWithSku> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<BookWithSku> booklist) {
        this.booklist = booklist;
    }

    public BookWithSku findBook(String sku) {
        BookWithSku found = null;
        ArrayList<BookWithSku> booklist = getBooklist();

        for (BookWithSku item : booklist) {
            if (item.getSku().equalsIgnoreCase(sku)){
                found = item;
                break;
            }
        }

        return found;
    }
}
