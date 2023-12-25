import java.lang.Override;

public abstract class Factory {
    protected abstract IProduct createProduct();

    public void action() {
        IProduct product = createProduct();
    }
}
