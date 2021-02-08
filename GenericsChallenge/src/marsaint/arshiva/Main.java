package marsaint.arshiva;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        MonkTeam vimin = new MonkTeam("Vimin");
        MonkTeam hunos = new MonkTeam("Hunos");
        MonkTeam sadri = new MonkTeam("Sadri");
        ShikariTeam tsuge = new ShikariTeam("Tsuge");
        ShikariTeam kumagai = new ShikariTeam("kumagai");
        ShikariTeam aoyama = new ShikariTeam("Aoyama");
        BushiTeam konoeKazunori = new BushiTeam("Konoe Kazunori");
        BushiTeam hojoChikafusa = new BushiTeam("Hojo Chikafusa");
        BushiTeam heikeKyoichi = new BushiTeam("Heike Kyoichi");

        League<MonkTeam> monkLeague = new League<MonkTeam>("Legend of Mahayana");
        monkLeague.addTeam(vimin);
        monkLeague.addTeam(hunos);
        monkLeague.addTeam(sadri);
        monkLeague.addTeam(vimin);

        League<ShikariTeam> shikariLeague = new League<ShikariTeam>("Legend of Kami");
        shikariLeague.addTeam(tsuge);
        shikariLeague.addTeam(kumagai);
        shikariLeague.addTeam(aoyama);
        shikariLeague.addTeam(tsuge);

        League<BushiTeam> bushiLeague = new League<BushiTeam>("Legend of Havakiri");
        bushiLeague.addTeam(konoeKazunori);
        bushiLeague.addTeam(hojoChikafusa);
        bushiLeague.addTeam(heikeKyoichi);
        bushiLeague.addTeam(heikeKyoichi);

        System.out.println(monkLeague.leagueSize());

//        sortTeamByName(bushiLeague);

//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Geeks For Geeks");
//        al.add("Friends");
//        al.add("Dear");
//        al.add("Is");
//        al.add("Superb");

//        Collections.sort(al);
//        System.out.println("al list: " + al);

//        System.out.println(bushiLeague.getTeams().get(0).getName());

    }

//    public static void sortTeamByName(League<BushiTeam> league) {
//        for (int i=0; i<league.getTeams().size(); i++) {
//            System.out.println(league.getTeams().get(i).getName());
//        }
//
//        ArrayList<String> teamName = new ArrayList<String>();
//        for (int i=0; i<league.getTeams().size(); i++) {
//            teamName.add(league.getTeams().get(i).getName());
//        }
//        System.out.println(teamName);
//        System.out.println("--sorted string--");
//        Collections.sort(teamName);
//        System.out.println(teamName);
//
//    }
}
