public class FlyweightFactory {
    private Flyweight flyweight;
    // other flyweights
    public Flyweight getFlyweight(int key) {
        return this.flyweight;
    }
}