public class Decorator implements Component {
    private Component wrappee;

    public Decorator(Component component) {
        this.wrappee = component;
    }

    public void action() {
        // action
    }
}