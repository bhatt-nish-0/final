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
    }
}
