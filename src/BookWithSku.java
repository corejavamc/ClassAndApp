public class BookWithSku {
    /*
     * Create a project in IntelliJ called BookApplication. Create a Book class that allows for Book title,
     * author, description, price and isInStock variables
     *
     * The Book class shall contain private member variables, a default constructor, an overloaded constructor
     * and a method called getDisplayText() which prints the author, title and description.
     */


    private String title;
    private String author;
    private String description;
    private double price;
    private boolean inStock;
    private String sku;

    public BookWithSku() {
    }

    public BookWithSku(String title, String author, String description,
                       double price, boolean inStock, String sku) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
        this.sku = sku;
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    /*
     * displayText() which prints the author, title and description.
     */
    public String displayText() {
        return "Author: " + getAuthor() +
                "\nTitle: " + getTitle() +
                "\nDescription: " + getDescription();
    }


}
