public class Invoker {
    // there could also be a sequence of commands, or a queue
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void doCommands() {
        this.command.execute();
    }
}
