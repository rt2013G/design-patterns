import java.util.Random;
import java.lang.Math;

public class Sword implements WeaponBehavior {
    public int useWeapon() {
        System.out.println("swinging sword...");
        Random r = new Random();
        // roll 3 d6
        int roll1 = r.nextInt() % 7;
        int roll2 = r.nextInt() % 7;
        int roll3 = r.nextInt() % 7;
        int result = Math.abs(roll1 + roll2 + roll3);
        System.out.println("rolled: " + result);

        return result;
    }
}