package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 14, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");
        // printAllNumbersInListFunctional(numbers);
        // printEvenNumbersInListFunctional(numbers);
        // printOddNumbersInListFunctional(numbers);
        // printCoursesIndividually(courses);
        // printCoursesWithTheWordSpring(courses);
        // printCoursesThatHasFourLetters(courses);
        // printSquaresOfEvenNumbersInListFunctional(numbers);
        printCubesOfOddNumbersInListFunctional(numbers);
        // printTheNumberOfCharactersOfCourses(courses);
    }

    // USANDO STREAM
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // FOCUS ON WHAT TO DO
        numbers.stream().forEach(System.out::println); // Method References
    }

    private static void printCoursesIndividually(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    // USANDO FILTER
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // FOCUS ON WHAT TO DO

        // Method References
        // numbers.stream().filter(FP01Functional::isEven)
        // .forEach(System.out::println);

        // Lambda Expression
        numbers.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        // Lambda Expression
        numbers.stream().filter(n -> n % 2 != 0) // Lambda Expression
                .forEach(System.out::println);
    }

    // USANDO MAP
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        // Lambda Expression
        numbers.stream().filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        // Lambda Expression
        numbers.stream().filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printCoursesWithTheWordSpring(List<String> courses) {
        courses.stream()
                .filter(c -> c.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesThatHasFourLetters(List<String> courses) {
        courses.stream()
                .filter(c -> c.length() >= 5)
                .forEach(System.out::println);
    }

    private static void printTheNumberOfCharactersOfCourses(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }
}
