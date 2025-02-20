package decision.making;

public class PatternMatching {
    public static void main(String[] args) {

        PatternMatching patternMatching
                = new PatternMatching();
        patternMatching.compareIntegers(67);
        patternMatching.compareIntegers(4);

        patternMatching.compareIntegersShort(67);
        patternMatching.compareIntegersShort(4);

        patternMatching.doSomethingwithNumber(3);
        patternMatching.doSomethingwithNumber(90.0);

        patternMatching.doSomethingwithNumber(9.0);

        boolean test = patternMatching.last("test");
        boolean buddah = patternMatching.last(null);

        System.out.println(test);
        System.out.println(buddah);
    }

    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer x = (Integer)number;
            System.out.println(x.compareTo(5));
        }
    }

    void compareIntegersShort(Number number) {
        if (number instanceof Integer what) {
            System.out.println(what.compareTo(5));
        }
    }


    void doSomethingwithNumber(Number num) {
        if (num instanceof Integer x) {
            System.out.println("1111");

        }else if (num instanceof Double d && d >89) {
            System.out.println("2222");
        }
    }

    void again(Number num) {
        if (num instanceof final Integer r) {
            //r = 98; --> cannot -- prevent reassignment
        }
    }

    boolean last(Object x) {
        if (x instanceof String) {
            return true;
        }else{
            return false;
        }
    }
}
