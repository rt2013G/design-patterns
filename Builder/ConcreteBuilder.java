public class ConcreteBuilder implements Builder {
    private int id;
    private int field1;
    private int field2;

    public void buildId(int id) {
        this.id = id;
    }

    public void buildField1(int field1) {
        this.field1 = field1;
    }

    public void buildField2(int field2) {
        this.field2 = field2;
    }

    public Product getResult() {
        return new Product(id, field1, field2);
    }
}
