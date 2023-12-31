import java.util.*;
import java.util.Random;
import java.lang.Math;
public class Subject {
    private List<Observer> observerList;
    private int state;
    private Random r;

    public Subject() {
        this.r = new Random();
        this.state = Math.abs(r.nextInt(20));
        observerList = new ArrayList<Observer>();
    }

    public void attach(Observer o) {
        this.observerList.add(o);
    }
    public void detach(Observer o) {
        this.observerList.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update();
        }
    }

    public void updateState() {
        this.state = Math.abs(r.nextInt(20));
        notifyObservers();
    }

    public int getState() {
        return this.state;
    }

}