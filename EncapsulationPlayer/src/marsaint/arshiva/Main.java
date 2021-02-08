package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Arshiva", 1000, "fist");

        player.loseHealth(50);
        player.loseHealth(20);
        player.loseHealth(50);
    }
}
