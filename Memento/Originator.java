public class Originator {
    private int originatorState;

    public Memento createMemento() {
        return new ConcreteMemento(this);
    }

    public void setState(int state) {
        this.originatorState = state;
    }

    public int getState() {
        return this.originatorState;
    }
}