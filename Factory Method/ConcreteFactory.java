public class ConcreteFactory extends Factory {

    @Override
    protected IProduct createProduct() {
        return new Product();
    }
}
