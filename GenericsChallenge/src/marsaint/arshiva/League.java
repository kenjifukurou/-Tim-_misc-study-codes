package marsaint.arshiva;


import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public boolean addTeam(T team) {
        if (this.teams.contains(team)) {
            System.out.println(team.getName() + " already existed, please add another team");
            return false;
        } else {
            this.teams.add(team);
            System.out.println(team.getName() + " added");
            return true;
        }
    }

    public int leagueSize() {
        return this.teams.size();
    }
    
    public void showLeagueTable() {
        Collections.sort(teams);
        Comparable.compareTo()
    }

}
