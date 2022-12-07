public class Author {
    public String name;
    public String cv;
    public String dateOfBirth;
    public String dateOfDeath;

    public Author(String name, String dateOfBirth, String dateOfDeath, String cv) {
        this.name = name;
        this.cv = cv;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public Author(String name, String dateOfBirth, String cv) {
        this.name = name;
        this.cv = cv;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = null;
    }

    public String toString() {
        return this.name;
    }

    public String getCV() {
        return this.cv;
    }


}
