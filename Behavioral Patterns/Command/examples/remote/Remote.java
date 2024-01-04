public class Remote {
    private Command onSlot;
    private Command offSlot;
    private Command lastCommand;

    public Remote(Command onSlot, Command offSlot) {
        this.onSlot = onSlot;
        this.offSlot = offSlot;
        this.lastCommand = new EmptyCommand();
    }

    public void pressOnButton() {
        onSlot.execute();
        lastCommand = onSlot;
    }

    public void pressOffButton() {
        offSlot.execute();
        lastCommand = offSlot;
    }

    public void pressUndoButton() {
        lastCommand.undo();
    }
}