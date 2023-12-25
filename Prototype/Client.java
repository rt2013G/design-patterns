public class Client {
    public static void main(String... args) {
        ConcretePrototype1 cp1 = new ConcretePrototype1();
        ConcretePrototype1 cp2 = (ConcretePrototype1) cp1.clone();
        ConcretePrototype2 cp3 = new ConcretePrototype2();
        ConcretePrototype2 cp4 = (ConcretePrototype2) cp3.clone();
    }
}