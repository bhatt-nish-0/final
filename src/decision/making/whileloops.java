package decision.making;

public class whileloops {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println("---" + counter);
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }

        while (counter<50)
            System.out.println("hey");
    }
}
