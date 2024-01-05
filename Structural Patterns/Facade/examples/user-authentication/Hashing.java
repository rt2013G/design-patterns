import java.util.Random;

public class Hashing {
    public Hashing() {
    }

    // some other methods

    public String getHash(String password) {
        int randomInt = new Random().nextInt() % 10;
        return (password+password).replaceAll("[a-iA-I]", Integer.toString(randomInt)); // some random hash function
    }
}