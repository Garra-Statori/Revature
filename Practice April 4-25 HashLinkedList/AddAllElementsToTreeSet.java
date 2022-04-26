import java.util.TreeSet;
public class AddAllElementsToTreeSet {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("Green");
        tree.add("Purple");

        TreeSet<String> tree0 = new TreeSet<>();
        tree.add("Black");
        tree.add("Blue");

        tree.addAll(tree0);
        System.out.println(tree);

    }

}
