package bubbleSort;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException("Input is null");
        }
        input = input.stream().filter(Objects::nonNull).collect(Collectors.toList());
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (String.valueOf(input.get(j)).compareTo(String.valueOf(input.get(j + 1))) > 0) {
                    Collections.swap(input, j, j + 1);
                }
            }
        }
        return input;
    }
}