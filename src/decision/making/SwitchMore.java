package decision.making;

public class SwitchMore {
    public static void main(String[] args) {


    }

    final int getCookies() { return 4; }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
            //case apples: // DOES NOT COMPILE
            //case getCookies(): // DOES NOT COMPILE
            //case cookies : // DOES NOT COMPILE
            case 3 * 5 :
        } }

    boolean doSomething(Season s) {
        return switch(s) {
            case ONE,THREE,FOUR -> false;
            case TWO -> true;
        };
    }
}

enum Season { ONE, TWO, THREE, FOUR}