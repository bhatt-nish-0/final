package packagemethod;

public class MainMethod {
    public static void main(String[] args) {

    }

    private int test() {
        return 3;
    }

    int test3() {
        int r = test();
        return 10;
    }

    protected int test4() {
        return 16;
    }

    public int test5(){
        return 20;
    }
}
