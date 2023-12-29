public class Client {
    public static void main(String... args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight(0).action();
    }
}