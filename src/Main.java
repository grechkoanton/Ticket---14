import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] testNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Исходный источник из массива: " + Arrays.toString(testNumbers));

        List<Integer> resultStream = processWithStream(testNumbers);
        System.out.println("Результат (решение через Stream): " + resultStream);
    }
    public static List<Integer> processWithStream(int[] numbers) {
        if (numbers == null || numbers.length < 8) {
            return List.of();
        }
        return IntStream.of(numbers)
                .map(num -> num % 2 == 0 ? num + 1 : num)
                .boxed()
                .collect(Collectors.toList())
                .subList(2,7);
    }
}