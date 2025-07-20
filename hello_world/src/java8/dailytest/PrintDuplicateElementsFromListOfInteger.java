package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateElementsFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 10);
        Map<Integer,Long> m = numbers.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        List<Integer> duplicate = m.entrySet().stream().filter(x->x.getValue()>1)
                .map(x-> x.getKey()).collect(Collectors.toList());
        System.out.println(duplicate);

    }

}
