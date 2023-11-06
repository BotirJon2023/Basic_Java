package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Task1NumberProcessor {

    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Отфильтровать на четные
    public List<Integer> filterEvenNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // Отфильтровать на нечетные
    public List<Integer> filterOddNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    // Просуммировать все числа
    public int sumAllNumbers() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Получить среднее значение
    public OptionalDouble getAverage() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    // Найти суммы чисел кратных 3 и 5
    public int sumNumbersDivisibleBy3And5() {
        return numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        Task1NumberProcessor processor = new Task1NumberProcessor();

        System.out.println("Четные числа: " + processor.filterEvenNumbers());
        System.out.println("Нечетные числа: " + processor.filterOddNumbers());
        System.out.println("Сумма всех чисел: " + processor.sumAllNumbers());
        System.out.println("Среднее значение: " + processor.getAverage().orElse(0.0));
        System.out.println("Сумма чисел, кратных 3 и 5: " + processor.sumNumbersDivisibleBy3And5());
    }
}