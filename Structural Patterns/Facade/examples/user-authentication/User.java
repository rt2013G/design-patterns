public class User {
    public User(String name, String surname, String passwordHash, int age) {
        this.name = name;
        this.surname = surname;
        this.passwordHash = passwordHash;
        this.age = age;
    }

    private String name;
    private String surname;
    private String passwordHash;
    private int age;
}