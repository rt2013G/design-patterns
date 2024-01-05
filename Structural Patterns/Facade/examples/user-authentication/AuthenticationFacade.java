import java.util.Scanner;

public class AuthenticationFacade {
    public User authenticate() {
        Scanner s = new Scanner(System.in);
        Hashing hashing = new Hashing();
        System.out.println("Please insert your name");
        String name = s.nextLine();
        System.out.println("Please insert your surname");
        String surname = s.nextLine();
        System.out.println("Please insert your age");
        int age = Integer.parseInt(s.nextLine());
        System.out.println("Please insert your password");
        String password = s.nextLine();
        String passwordHash = hashing.getHash(password);
        return new User(name, surname, passwordHash, age);
    }
}