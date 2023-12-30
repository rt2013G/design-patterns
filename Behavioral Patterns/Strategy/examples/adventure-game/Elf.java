public class Elf extends Character {
    public Elf(String name) {
        this.name = name;
        this.life = 8;
        this.weaponBehavior = new Sword();
    }
}