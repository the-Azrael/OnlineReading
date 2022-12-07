public class Main {
    private static final Author GRIBOEDOV_AS = new Author("Грибоедов А.С.", "", "15.01.1795", "11.02.1829");
    private static final Book GORE_OT_YMA = new Book("Горе от ума", GRIBOEDOV_AS, "Азбука", 200);

    public static void main(String[] args) {
        System.out.println(GORE_OT_YMA.toString());
    }
}
