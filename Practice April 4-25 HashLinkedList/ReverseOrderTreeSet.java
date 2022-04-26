import java.util.*;

public class ReverseOrderTreeSet {

    public static void main(String[] args)

            throws Exception
    {
        try {

            TreeSet<String> tree = new TreeSet<String>();

            tree.add("Blue");
            tree.add("Green");

            System.out.println(tree);


            NavigableSet<String>
                    treereverse = tree.descendingSet();

            Iterator<String> iterator = treereverse.iterator();


            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        catch (NullPointerException a) {

            System.out.println("Exception thrown : " + a);
        }
    }
}


