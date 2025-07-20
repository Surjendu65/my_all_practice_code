package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacterInAString {
    public static void main(String[] args) {
        String str = "programme";
        Map<String, Long> m = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        List<String> lis = m.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(x -> x.getKey())
                .collect(Collectors.toList());
        System.out.println(lis);

        System.out.println("Commit -1");
    }
}
