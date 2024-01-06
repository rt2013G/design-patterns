public class Client {
    public static void main(String... args) {
        Worker firefighter = new Firefighter();
        Worker lumberjack = new Lumberjack();
        Worker postman = new Postman();

        firefighter.dailyRoutine();
        lumberjack.dailyRoutine();
        postman.dailyRoutine();
    }
}