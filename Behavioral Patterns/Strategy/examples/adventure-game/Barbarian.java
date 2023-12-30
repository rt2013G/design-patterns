public class Barbarian extends Character {
    public Barbarian(String name) {
        this.name = name;
        this.life = 10;
        this.weaponBehavior = new Axe();
    }
}