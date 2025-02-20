package streams;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Optional<Double> o =average(90,100);
        System.out.println(o);

        //o = average();
        //System.out.println(o);

        if (o.isPresent()) {
            System.out.println(o.get());
        }
    }

    public static Optional<Double> average(int... scores) {
         if (scores.length == 0) return Optional.empty();
         int sum = 0;
         for (int score: scores) sum += score;
         return Optional.of((double) sum / scores.length);
         }
}
