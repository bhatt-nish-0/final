package decision.making;

public class MoreSwitching {
    public static void main(String[] args) {
        MoreSwitching moreSwitching
                =new MoreSwitching();
        moreSwitching.switchswitch(300);

        moreSwitching.printSeasonForMonth(2);
    }

    public void switchswitch(int g) {

        switch(g) {
            case 1 :
                System.out.println("test");
                break;
            case 2:
                System.out.println("test2");
                break;
            case 3:
                System.out.println("test3");
                break;
            default:
                System.out.println("hi");
        }
    }

    void printSeasonForMonth(int month) {
        String value = switch (month) {
            case 1, 2, 3 -> "Winter-";
            case 4, 5, 6 -> "Spring-";
            default -> "Unknown-";
            case 7, 8, 9 -> "Summer-";
            case 10, 11, 12 -> "Fall-";
        };
        System.out.print(value);
        printWeather(2);
    }

    void printWeather(int rain) {
        switch (rain) {
            case 0 -> System.out.print("Dry");
            case 1 -> System.out.print("Wet");
            case 2 -> System.out.print("Storm");
        }
    }

    int sizey() {
        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> Integer.valueOf(1);
            case 10 -> (short)2;
            default -> 3;
            //case 20 -> "4"; // DOES NOT COMPILE
            //case 40 -> 5L; // DOES NOT COMPILE
            //case 50 -> null; // DOES NOT COMPILE
        };
        return size;
    }
}
