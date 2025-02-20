package decision.making;

public class YieldStatement {
    public static void main(String[] args) {
        YieldStatement yieldStatement
                = new YieldStatement();
        String ord = yieldStatement.tesla();
        System.out.println(ord);
    }

    public String tesla() {
        int x = 3;
        return  switch(x) {
            case 3 -> {
                yield "test";
            }
            case 45 -> "a";
            default -> "acx";
        };
    }
}
