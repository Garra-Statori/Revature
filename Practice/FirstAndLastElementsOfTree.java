import java.util.*;
public class FirstAndLastElementsOfTree {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("Blue");
        tree.add("Green");
        tree.add("Purple");
        tree.add("Orange");

        System.out.println(tree);
        System.out.println();

        Object f = tree.first();
        System.out.println(f);

        Object l = tree.last();
        System.out.println(l);
    }

}
