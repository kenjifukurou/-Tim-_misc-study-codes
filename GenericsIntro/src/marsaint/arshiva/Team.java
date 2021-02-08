package marsaint.arshiva;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    public String teamName;
    int gamePlayed = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<T>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already exist in team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " added into team " + this.teamName);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
        } else if (ourScore < theirScore) {
            this.lost++;
        } else if (ourScore == theirScore) {
            this.tied++;
        }
        gamePlayed++;
        if (opponentTeam != null) {
            opponentTeam.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won + tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        return 0;
    }
}
