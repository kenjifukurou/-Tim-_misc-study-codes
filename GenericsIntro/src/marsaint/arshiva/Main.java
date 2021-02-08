package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        //create player:
        BaseballPlayer joe = new BaseballPlayer("Joe");
        BasketballPlayer bash = new BasketballPlayer("Bash");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<BasketballPlayer> bbTeam = new Team<BasketballPlayer>("BB Team");
        bbTeam.addPlayer(bash);
        String member = bbTeam.getMembers().get(0).getName();
        System.out.println(member);

    }
}
