public abstract class Character {
    protected String name;
    protected int life;
    protected WeaponBehavior weaponBehavior;

    public int getLife() {
        return this.life;
    }

    public void inflictDamage(int damage) {
        this.life -= damage;
    }

    public void fight(Character character) {
        int damage = this.weaponBehavior.useWeapon();
        character.inflictDamage(damage);
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void printLife() {
        System.out.println(this.name + ": life=" + this.life);
    }
}