package java8.dailytest;
//Q.Print the list of Decimal value in ascending order
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PrintTheListOfDecimalValueInAscendingOrder {
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(12.4,23.4,90.4,12.1,8.9);
        List<Double> d = l.stream().sorted().toList();
        System.out.println(d);


        l.stream().sorted().forEach(System.out::println);


        l.stream().sorted(Double::compareTo).forEach(System.out::println);


        List<Double> ascnDec = l.stream().sorted(Double::compareTo).toList();
        System.out.println(ascnDec);


        Collections.sort(l);
        System.out.println(l);
    }
}
