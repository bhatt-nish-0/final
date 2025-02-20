package decision.making;

public class DefaultSwitch {
    public static void main(String[] args) {
        int x = 20;

        switch(x) {
            case 21:
                System.out.println("he");
                break;
            case 22:
                System.out.println("1");
                break;
            default:
                System.out.println("def");
                break;
                //here break is needed!
            case 29:
                System.out.println("29");
                break;
            case 33:
                System.out.println("33");
                break;
        }
        //unreachable code means cant compile


//        Number zooPatrons = Integer.valueOf(1_000);
//        switch (zooPatrons) {
//            case Integer count -> System.out.print("Welcome: " + count);
//        }
        // does not compile --> if number is instance of Double, then what?

        String fish = null;
        System.out.print(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "BlueTang" -> "Hello again!";
            //case null -> "What type of fish are you?";
            default -> "Goodbye";
        });


    }


}
