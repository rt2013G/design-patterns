public class Proxy implements Subject {
    private Subject realSubject;

    public Proxy() {
    }

    public void request() {
        if (this.realSubject == null) {
            realSubject = new RealSubject();
        }

        realSubject.request();
    }
}