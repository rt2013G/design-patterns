public class Watcher implements Observer {
    private Subject subject;
    private int lastValue;

    public Watcher(Subject subject) {
        this.subject = subject;
        subject.attach(this);
        lastValue = subject.getState();
    }

    public void update() {
        int newValue = subject.getState();
        if(newValue > lastValue) {
            // do some calculations
            System.out.println("Watcher: value increased.");
        }
        System.out.println("Watcher: analysis completed.");
    }
}