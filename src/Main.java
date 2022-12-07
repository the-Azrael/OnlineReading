import java.sql.Date;

public class Main {
    private static final Author GRIBOEDOV_AS = new Author("Грибоедов А.С.", "", "15.01.1795", "11.02.1829");
    private static final Book GORE_OT_YMA = new Book("Горе от ума", GRIBOEDOV_AS, "Азбука", 200);

    public static void main(String[] args) {
        System.out.println(GORE_OT_YMA.toString());

        User user1 = new User("Mikhail", "Svetlov", "msvetlov@any.com", new Date(99, 10, 1));
        user1.showUser();
        User user2 = new User();
        user2.setData("Valeriy", "Molotov", "moloto10@sss.com", new Date(110, 2, 23));
        user2.showUser();
        System.out.println("Количество пользователей: " + User.getUserCount() + "\n");
    }
}
