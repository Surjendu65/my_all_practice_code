package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyListOfInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 10);
        var v = numbers.stream().collect(Collectors.groupingBy(
                x->x,
                Collectors.counting()
        ));
        System.out.println(v);




    }
}
