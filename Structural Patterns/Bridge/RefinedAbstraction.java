public class RefinedAbstraction implements Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor
    }

    public void operation() {
        this.implementor.newOperation();
    }

    private Implementor implementor;
}