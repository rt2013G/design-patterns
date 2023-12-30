public class Director {
    public static void main(String... args) {
        Director director = new Director();
        director.buildProductA();
        director.buildProductB();
    }

    public Product buildProductA() {
        ConcreteBuilder builder = new ConcreteBuilder();
        builder.buildId(0);
        builder.buildField1(1);
        builder.buildField2(2);
        return builder.getResult();
    }

    public Product buildProductB() {
        ConcreteBuilder builder = new ConcreteBuilder();
        builder.buildId(1);
        builder.buildField1(2);
        builder.buildField2(3);
        return builder.getResult();
    }
}
