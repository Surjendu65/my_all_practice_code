package java8;
//Q.Print the list of Decimal value in ascending order
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintTheListOfDecimalValueInAscendingOrder {
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(12.4,23.4,90.4,12.1,8.9);
        List<Double> d = l.stream().sorted().collect(Collectors.toList());
        System.out.println(d);

        System.out.println("-----------");
        l.stream().sorted().forEach(System.out::println);

        System.out.println("-----------");
        l.stream().sorted(Double::compareTo).forEach(System.out::println);

        System.out.println("-----------");
        List<Double> ascnDec = l.stream().sorted(Double::compareTo).collect(Collectors.toList());
        System.out.println(ascnDec);

        System.out.println("-----------");
        Collections.sort(l);
        System.out.println(l);
    }
}
