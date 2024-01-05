public class Client {
    public static void main(String... args) {
        AuthenticationFacade facade = new AuthenticationFacade();
        User user = facade.authenticate();
    }
}