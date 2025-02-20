package streams;

import java.util.Optional;

public class OptionalAnother {
    public static void main(String[] args) {
        Optional<Object> o = Optional.ofNullable(null);
        if (!o.isPresent()){
        //    System.out.println(o.get());
        }

        Optional<Double> aDouble = Optional.of(2.3);

        aDouble.ifPresent(x -> System.out.println(x));
    }
}
