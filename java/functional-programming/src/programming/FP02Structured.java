package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 14, 4, 6, 2, 4, 12, 15);

        int sum = addListStructered(numbers);
        System.out.println(sum);
    }

    private static int addListStructered(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
