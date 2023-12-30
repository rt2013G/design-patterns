public class ConcreteIterator implements Iterator {
    private Container container;
    public ConcreteIterator(Container container) {
        this.container = container;
    }
    public Object first() {
        // get first item of the collection
    }
    public Object next() {
        // get next item in the collection
    }
    public boolean isLast() {
        // check if the iterator is at the last item of the collection
    }
    public Object currentItem() {
        // get the current item in the collection
    }
}
