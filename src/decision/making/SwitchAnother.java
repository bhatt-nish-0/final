package decision.making;

public class SwitchAnother {
    public static void main(String[] args) {

        SwitchAnother switchAnother
                = new SwitchAnother();
        String rrr = switchAnother.test(2);
        System.out.println(rrr);
    }

    public String test(int type) {
        return switch (type) {
            case 0 -> "lion";
            case 1 -> "tiger";
            case 2,3 -> "buffalo";
            default -> "not known";
        };
    }
}
