package marsaint.arshiva;

import java.util.List;

public class Monster implements ISaveGame {

    private int x;

    public Monster(int x) {
        this.x = x;
    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> savedValues) {

    }
}
