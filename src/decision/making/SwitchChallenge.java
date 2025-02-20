package decision.making;

public class SwitchChallenge {
    public static void main(String[] args) {
        int weather = 2;

        switch (weather) { // #3
            case 2: System.out.print("Rainy");
            case 5: {
                System.out.print("Sunny");
            }
        }

        switch (weather) {}
    }
}
