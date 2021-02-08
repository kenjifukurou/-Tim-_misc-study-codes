package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveableCharacter{

    private String name;
    private int healthPoint;
    private int strength;
    private String weapon;
    private List<String> gameSaves;

    public Player(String name, int healthPoint, int strength) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.strength = strength;
        this.weapon = "Spear";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
        System.out.println("health point has set to: " + healthPoint);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
        System.out.println("strength has set to: " + strength);
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println("weapon has set to: " + weapon);
    }

    public List<String> getGameSaves() {
        return gameSaves;
    }

    public void setGameSaves(List<String> gameSaves) {
        this.gameSaves = gameSaves;
    }

    @Override
    public String toString() {
        return "== Player: " + name + " == \n" +
                "== HP: " + healthPoint + " == \n" +
                "== Strength: " + strength + " == \n" +
                "== Weapon: " + weapon + " ==";
    }

    @Override
    public List<String> write() {

        List<String> playerSaves = new ArrayList<String>();
        playerSaves.add(0, this.name);
        playerSaves.add(1,"" + this.healthPoint);
        playerSaves.add(2, "" + this.strength);
        playerSaves.add(3, this.weapon);

        gameSaves = playerSaves;
        return playerSaves;

    }

    @Override
    public void read() {

        if (gameSaves != null && gameSaves.size() > 0) {
            this.name = gameSaves.get(0);
            this.healthPoint = Integer.parseInt(gameSaves.get(1));
            this.strength = Integer.parseInt(gameSaves.get(2));
            this.weapon = gameSaves.get(3);
            System.out.println("character's stats load complete");
            System.out.println(gameSaves.toString() + " has loaded");
        } else {
            System.out.println("game saves not found");
        }
    }

    @Override
    public void modify(List<String> valuesToModify) {

        System.out.println("modify player's value:");
        this.name = valuesToModify.get(0);
        this.healthPoint = Integer.parseInt(valuesToModify.get(1));
        this.strength = Integer.parseInt(valuesToModify.get(2));
        this.weapon = valuesToModify.get(3);
        System.out.println("character's stats modified");
    }
}
