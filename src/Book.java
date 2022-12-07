public class Book {
    public String title;
    public Author author;
    public String publisher;
    public int pageCount;
    public double price;
    public int discount;

    public Book(String title, Author author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
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
        String str = "[ \n\t" + this.title + ",\n\t" + this.author.name + ",\n\t" + this.publisher + ",\n\t" + this.pageCount + "\n]";
        return str;
    }
}
