public class Numbers {
    public static void main(String... args) {
        Subject subject = new Subject();
        Observer watcher = new Watcher(subject);
        Observer psychologist = new Psychologist(subject);

        System.out.println("test1:");
        subject.updateState();
        System.out.println("test2:");
        subject.updateState();
        System.out.println("test3:");
        subject.updateState();

    }
}