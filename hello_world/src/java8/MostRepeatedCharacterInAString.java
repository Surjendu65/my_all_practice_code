package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedCharacterInAString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("p", "r", "o", "g", "r", "a", "m", "m", "e","o","o","r");
        Map<String, Long> m = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        var dupChar = m.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(dupChar);
    }
}
