public abstract class Observable {
    protected Observer[] observers;
    private int state;
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract int getState();
    public abstract void setState(int state);
    public abstract void notifyObservers();

}