package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int finalDamageOutput = calculateDamage("Kenji", 5, 10);
        System.out.println("final damage: " + finalDamageOutput);

        int buffDamageOutput = calculateDamage("Marsaint", 5, 10, 2);
        System.out.println("final buff damage: " + buffDamageOutput);
    }

    public static int calculateDamage(String playerName, int str, int damageNormal) {
        int damage = str * damageNormal;
        System.out.println(playerName + " base damage is: " + damage);
        return damage * 10;
    }

    public static int calculateDamage(String playerName, int str, int damageNormal, int buff) {
        int damage = (str * damageNormal) * buff;
        System.out.println(playerName + " base damage with buff is: " + damage);
        return damage * (10 * buff);
    }
}
