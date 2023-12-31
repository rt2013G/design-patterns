public class ConcreteObserver implements Observer {
    private int observerState;

    public void update(Observable subject) {
        this.observerState = subject.getState();
    }
}