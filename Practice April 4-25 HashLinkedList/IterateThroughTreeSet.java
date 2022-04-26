import java.util.TreeSet;
public class IterateThroughTreeSet {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("Purple");
        tree.add("Green");

        for (String element : tree) {
            System.out.println(element);
        }

    }

}
