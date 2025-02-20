package decision.making;

public class ExhaustingSwitch {
    public static void main(String[] args) {

    }

    void exhaustiveSwitches() {
        int r = 200;
        String type = switch (r) {
             case 2 -> "hello";
            default -> "tim";
        };

        //exhaustive

        //enum - no need default


    }

    void harami() {
        ABC s = ABC.ONE;
        String j = switch (s) {
            case ONE -> "test";
            case TWO -> "what";
            case THREE -> "terminator";
            default -> throw new RuntimeException("test");

        };
    }
}

enum ABC {
    //ONE,TWO,THREE;
    ONE,TWO,THREE,FOUR;
}
