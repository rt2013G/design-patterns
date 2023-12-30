public class AdventureGame {
    public static void main(String... args) {
        Character jorge = new Barbarian("jorge");
        Character henry = new Elf("henry");
        jorge.fight(henry);
        henry.printLife();
    }
}