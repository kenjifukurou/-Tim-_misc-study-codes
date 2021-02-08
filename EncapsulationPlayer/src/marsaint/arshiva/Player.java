package marsaint.arshiva;

public class Player {

    private String name;
    private int health = 100;
    private String weapon;

    // constructor
    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
        System.out.println(this.name + " initial health is: " + this.health + ", with weapon: " + this.weapon);
    }

    // lose health method
    public void loseHealth(int damage) {
        if (health > 0) {
            this.health -= damage;
        }
        System.out.println("player taken: " + damage + " damage");
        if (health <= 0) {
            System.out.println("player is dead");
        }
    }

    public int getHealth() {
        return health;
    }

}
