public class RemoteLoader {
    public static void main(String... args) {
        TV tv = new TV();
        Command tvOn = new TVOnCommand(tv);
        Command tvOff = new TVOffCommand(tv);
        Remote remote = new Remote(tvOn, tvOff);

        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();
    }
}