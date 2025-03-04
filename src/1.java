import java.util.*;

public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                list.add(number);
            }
        }
        System.out.println("Even numbers: " + list);
    }
}
