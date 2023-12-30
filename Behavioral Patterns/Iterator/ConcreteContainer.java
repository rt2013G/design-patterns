public class ConcreteContainer implements Container {
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}