package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 14, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
        "Kubernetes");

        // Collect a new list with the square of numbers
        List<Integer> doubledNumbers = squareList(numbers);
        System.out.println("List of the square of numbers: " + doubledNumbers);

        // Collect a new list with only the even numbers
        List<Integer> evenNumbers = getEvenNumbers(numbers);
        System.out.println("List of the odd numbers: " + evenNumbers);

        //Collect a new list with the length of the string courses
        List<Integer> lengthOfCoursesTitles = getLengthOfCoursesTitles(courses);
        System.out.println("List of the length of the string courses: " + lengthOfCoursesTitles);
    }

    private static List<Integer> getLengthOfCoursesTitles(List<String> courses) {
        return courses.stream().map(str -> str.length()).collect(Collectors.toList());
    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    }

    private static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).collect(Collectors.toList());
    }
}
