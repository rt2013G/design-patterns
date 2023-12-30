public class ConcreteMemento implements Memento {
    private int mementoState;
    private Originator originator;

    public ConcreteMemento(Originator originator) {
        this.mementoState = originator.getState();
    }

    public void restoreState() {
        this.originator.setState(mementoState);
    }
}