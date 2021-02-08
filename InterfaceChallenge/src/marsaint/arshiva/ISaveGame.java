package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;

public interface ISaveGame {

    List<String> write();

    void read(List<String> savedValues);

}
