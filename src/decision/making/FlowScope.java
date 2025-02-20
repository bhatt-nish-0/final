package decision.making;

public class FlowScope {
    public static void main(String[] args) {

    }

    void printIntegersOrNumbersGreaterThan5(Number number) {
        //if (number instanceof Integer data || data.compareTo(5) > 0) {
             //flow scoping
        //}

        if (number instanceof Integer data && data.compareTo(5) > 0) {

        }

    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return; }
        System.out.print(data.intValue());
    }
}
