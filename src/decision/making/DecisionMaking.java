package decision.making;

public class DecisionMaking {
    public static void main(String[] args) {
        String patrons;

        patrons = "test";

        {
            patrons = "what?";
        }

        int x = 23;

        if (x == 10)
            System.out.println("hey");
        System.out.println("hi there bro") ; //always executed

        if (x == 10) {
            System.out.println("hi there");
            System.out.println("also printed");
        }

    }
}
