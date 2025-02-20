package decision.making;

public class Switchy {
    public static void main(String[] args) {
        int bear = 0;
        System.out.println(switch (bear) {
            case 0 -> "test";
             default -> "ooo";
        });

        String q = switch (bear) {
            case 0 -> "test";
            default -> "ooo";
        };

        System.out.println(q);

        int g = switch (bear) {
          case 2 -> 3;
            default -> 78;
        };

        System.out.println(g);
    }
}
