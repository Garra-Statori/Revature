import java.util.*;
import java.util.Iterator;
public class IterateThroughHashList {

    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        hash.add("Tickles");
        hash.add("Friend");

        Iterator<String> x = hash.iterator();

        while(x.hasNext()) {
            System.out.println(x.next());
        }

    }

}
