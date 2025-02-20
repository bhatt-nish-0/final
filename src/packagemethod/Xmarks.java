package packagemethod;

public class Xmarks {
    public static void main(String[] args) {
        Xmarks xmarks
                = new Xmarks();
        xmarks.x();
    }

    void x() {
        MainMethod mainMethod
                = new MainMethod();
        mainMethod.test3();
        //mainMethod.test();
        mainMethod.test4();
    }
}
