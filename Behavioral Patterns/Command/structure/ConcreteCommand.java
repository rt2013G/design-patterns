public class ConcreteCommand implements Command {
    public void execute(Receiver receiver) {
        receiver.action();
    }
}