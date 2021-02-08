package marsaint.arshiva;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Cache<String> cacheString = new Cache<String>();
        cacheString.setValue("Arshiva");

        Cache<Integer> cacheInt = new Cache<Integer>();
        cacheInt.setValue(8329387);

        System.out.println(cacheString.getValue());
        System.out.println(cacheInt.getValue());

    }

}
