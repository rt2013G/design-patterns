import java.util.Random;
import java.lang.Math;

public class Axe implements WeaponBehavior {
    public int useWeapon() {
        System.out.println("swinging axe...");
        Random r = new Random();
        // roll 2 d10
        int roll1 = r.nextInt() % 11;
        int roll2 = r.nextInt() % 11;
        int result = Math.abs(roll1 + roll2);
        System.out.println("rolled: " + result);

        return result;
    }
}