package decision.making;

public class PatternMatchingWhatWorks {
    public static void main(String[] args) {

        Number bearHeight = Integer.valueOf(123);

         if (bearHeight instanceof Integer i) {}
        if (bearHeight instanceof Float qor) {}
         //if (bearHeight instanceof Number n) {}
         //if (bearHeight instanceof String s) {} // DOES NOT COMPILE
         //if (bearHeight instanceof Object o) {}
    }
}
