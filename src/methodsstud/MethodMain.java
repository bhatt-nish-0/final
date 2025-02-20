package methodsstud;

public class MethodMain {
    public static void main(String[] args) {

        try {
            nap(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static final void nap(int minutes) throws InterruptedException {
        System.out.println("test");
    }

    public final static void nap1(int mins) throws InterruptedException {

    }

    void x() {
        //simplest method possible
    }

    final public void shit() {
        //what!
        return;
    }

    public final void test(String a, String b) {

    }


}
