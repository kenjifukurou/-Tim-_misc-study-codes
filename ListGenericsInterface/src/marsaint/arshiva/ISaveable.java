package marsaint.arshiva;

import java.util.List;

public interface ISaveable {

    List writeFile();
    void readFile(List savedFile);
}
