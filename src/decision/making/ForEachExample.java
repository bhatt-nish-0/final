package decision.making;

import java.util.*;

public class ForEachExample {

    public static void main(String[] args) {
        //Collection<String> x = new HashSet<>();
        //Collection is an iterable
        //x.add("a");

        //Iterable<String> x = new HashSet<>();

        Collection<String> x = new HashSet<>();
        x.add("a");
        x.add("b");
        x.add("c");

        //to use for each it needs to be iterable or
        // it needs to be
        // java in built array
        for (String r : x) {
            System.out.println(r);
        }

        int[] x3 = new int[]{1,2,3};

        for (int i : x3) {
            System.out.println(i);
        }

        for (var n : x3) {
            System.out.println(n);
        }
    }

}
