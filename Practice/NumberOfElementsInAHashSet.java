import java.util.*;
import java.util.Iterator;
public class NumberOfElementsInAHashSet {
    public static void main(String[] args) {


        HashSet<String> hash = new HashSet<>();

        hash.add("Turtle");
        hash.add("Bird");

        System.out.println(hash);
        System.out.println(hash.size());
    }
}
