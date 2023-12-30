public class Factory {
    public Factory() {
    }

    public Product createProduct(int param) {
        if(param == 1) {
            return new Product1();
        } else {
            return new Product2();
        }
    }
}