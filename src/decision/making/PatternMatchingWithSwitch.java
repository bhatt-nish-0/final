package decision.making;

public class PatternMatchingWithSwitch {
    public static void main(String[] args) {
        PatternMatchingWithSwitch
                patternMatchingWithSwitch
                =
                new
                        PatternMatchingWithSwitch();
        patternMatchingWithSwitch.printDetails(3);
        patternMatchingWithSwitch.printDetails(3.3);
        patternMatchingWithSwitch.printDetails(2.6F);
    }

    void printDetails(Number height) {
        //String message = switch (height) {
            //case Integer i -> "Rounded: " + i;
            //case Double i -> "Precise: " + i;
            //case Number i -> "Unknown: " + i;

        //};
        //System.out.print(message);

    }

//    String getTrainer(Number height) {
//        return switch (height) {
//            case Integer i when i > 10 -> "Joseph";
//                case Integer i -> "Daniel";
//            case Double num when num <= 15.5 -> "Peter";
//                case Double num -> "Kelly";
//                case Number num -> "Ralph";
//        };
//    }
    //now switch can handle ranges


}
