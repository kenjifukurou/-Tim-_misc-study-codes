package marsaint.arshiva;

import java.util.List;

public interface ISaveableCharacter {

    List<String> write();

    void read();

    void modify(List<String> valuesToModify);

}
