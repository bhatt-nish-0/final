package decision.making;

public class AnotherScenario {
    public static void main(String[] args) {
        String fish = null;
        System.out.print(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "BlueTang" -> "Hello again!";
            //case null -> "What type of fish are you?";
            //above works in java 21
            default -> "Goodbye";
            //case null has to be accompanied with default

        });
    }
}
