/*
 * Create a project in IntelliJ called BookApplication. Create a Book class that allows for Book title,
 * author, description, price and isInStock variables
 *
 * The Book class shall contain private member variables, a default constructor, an overloaded constructor
 * and a method called getDisplayText() which prints the author, title and description.
 */

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean inStock;

    public Book() {
    }

    public Book(String title, String author, String description, double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    /*
     * displayText() which prints the author, title and description.
     */
    public String displayText() {
        return "Author: " + getAuthor() +
               "\nTitle: " + getTitle() +
               "\nDescription: " + getDescription();
    }

    /*
     * Create a method that returns a price for a requested number of books.
     * As an example, five books at $20.00 should return $100, if they are in stock.
     * If they are not in stock, that should be handled appropriately (hint - you decide).
     */
    public String computePrice(int numb) {
        double sum = 0;
        String result;

        if (isInStock()) {
            sum = numb * getPrice();
            result = "The total price is $" + sum;
        }
        else
            result = "The book is temporally out of stock.";

        return result;
    }
}
