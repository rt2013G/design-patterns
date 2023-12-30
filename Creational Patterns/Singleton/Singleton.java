public class Singleton {
    private static Singleton Instance;
    public Singleton() {
    }

    public static Singleton getInstance() {
        if(Instance == null) {
            Instance = new Singleton();
        }

        return Instance;
    }

    private void printHello() {
        System.out.println("Hello world");
    }

    public static void main(String... args) {
        Singleton.getInstance().printHello();
    }
}
