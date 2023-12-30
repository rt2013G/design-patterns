public class ConcreteObservable extends Observable {
    private int state;
    public void attach(Observer observer) {
        // add observer to the observers
    }
    public void detach(Observer observer) {
        // remove observer from the observers
    }
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

}