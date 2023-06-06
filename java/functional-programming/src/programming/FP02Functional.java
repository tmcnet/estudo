package programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 12, 9, 14, 4, -3, 6, 2, 4, 12, 15);
        int sum = addListFunctional(numbers);
        System.out.println(sum);
    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " + " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int getGreaterValue(int aggregate, int nextNumber) {
        System.out.println(aggregate + " > " + nextNumber);
        return aggregate > nextNumber ? aggregate : nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {
        // return numbers.stream().reduce(0, (a, b) -> a + b); // Using lambda expression
        // return numbers.stream().reduce(1, FP02Functional::sum); // Using method reference
        return numbers.stream().reduce(Integer.MIN_VALUE, FP02Functional::getGreaterValue); // Using method reference
        // return numbers.stream().reduce(0, Integer::sum); // Using method reference
    }
}
