import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private static int userCount = 0;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY");

    private String name;
    private String surname;
    private String email;
    private Date birthDate;

    public User() {
        User.userCount++;
        this.name = "anonymous";
        this.surname = "anonymous";
        this.email = "";
        this.birthDate = new Date();
    }

    public User(String name, String surname, String email, Date birthDate) {
        User.userCount++;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void setData(String name, String surname, String email, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
    }

    public static int getUserCount() {
        return userCount;
    }

    public void showUser() {
        System.out.println("[ Имя: " + this.name + ", Фамилия: " + this.surname
                + ", Почта: " + this.email + ", Дата рождения: " + formatter.format(this.birthDate));
    }
}
