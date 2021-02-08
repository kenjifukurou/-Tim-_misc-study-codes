package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveGame {

    private String name;
    private String job;
    private int healthPoint;
    private int strength;
    private int agility;
    private String weapon;

    public Player(String name, String job, int healthPoint, int strength, int agility) {
        this.name = name;
        this.job = job;
        this.healthPoint = healthPoint;
        this.strength = strength;
        this.agility = agility;
        this.weapon = "Spear"; //default weapon
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player {" + '\n' +
                "name='" + name + '\n' +
                "job='" + job + '\n' +
                "healthPoint=" + healthPoint + '\n' +
                "strength=" + strength + '\n' +
                "agility=" + agility + '\n' +
                "weapon='" + weapon + '\n' +
                '}';
    }

    @Override
    public List<String> write() {

        List<String> savedValues = new ArrayList<String>(); //create a list to store player's values

        savedValues.add(0, this.name);
        savedValues.add(1, this.job);
        savedValues.add(2, "" + this.healthPoint);
        savedValues.add(3, "" + this.strength);
        savedValues.add(4, "" + this.agility);
        savedValues.add(5, this.weapon);

        return savedValues;
    }

    @Override
    public void read(List<String> savedValues) {

    }
}
