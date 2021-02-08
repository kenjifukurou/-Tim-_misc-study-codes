package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<String> player;
    private String name;

    public Players(String name) {
        this.name = name;
        ArrayList<String> newPlayer = new ArrayList<String>();
        this.player.add(newPlayer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlayer() {
        return player;
    }

    public void setPlayer(List<String> player) {
        this.player = player;
    }
}
