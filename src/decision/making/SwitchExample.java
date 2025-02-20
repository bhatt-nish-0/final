package decision.making;

public class SwitchExample {
    public static void main(String[] args) {
        int type = 2;
        String animal;

        switch (type) {
            case 0:
                animal = "Lion";
                break;
            case 1:
                animal = "Elephant";
                break;
            case 2, 3:
                animal = "Alligator";
                break;
            case 4:
                animal = "Crane";
                break;
            default:
                animal = "Unknown";
        }
        System.out.println(animal);
    }
}
