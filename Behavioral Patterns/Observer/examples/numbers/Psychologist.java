public class Psychologist implements Observer {
    private Subject subject;
    private int lastValue;
    public Psychologist(Subject subject) {
        this.subject = subject;
        subject.attach(this);
        lastValue = subject.getState();
    }

    public void update() {
        int newValue = subject.getState();
        if(newValue > lastValue) {
            // do some calculations
            System.out.println("Psychologist: state has increased.");
        } else {
            // do some other calculations
            System.out.println("Psychologist: state has deteriorated.");
        }
        System.out.println("Psychologist: analysis completed.");
    }
}