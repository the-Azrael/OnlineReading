public class Book {
    private String title;
    private String authorName;
    private String publisher;
    private int pageCount;
    private double price;
    private int discount;

    public Book(String title, String authorName, String publisher, int pageCount) {
        this.title = title;
        this.authorName = authorName;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getCost() {
        return this.price - this.price * this.discount / 100;
    }

    public String toString() {
        String str = "[ \n\t" + this.title + ",\n\t" + this.authorName + ",\n\t" + this.publisher + ",\n\t" + this.pageCount + "\n]";
        return str;
    }
}
