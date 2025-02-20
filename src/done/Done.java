package done;

import java.util.Optional;

public class Done {
    public static void main(String[] args) {
        System.out.println("89 pages done");
        System.out.println("59 pages done");

        int x = 89;
        int y = 59;

        System.out.println("total done :" + (x+y));

        Optional<Double> opt = Optional.of(95.0);
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow());

        opt = Optional.empty();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
       // System.out.println(opt.orElseThrow());
    }
}

