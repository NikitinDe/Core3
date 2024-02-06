package task.stream;

import java.util.ArrayList;
import java.util.List;

public class LargestNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int result = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(result);

    }
}
