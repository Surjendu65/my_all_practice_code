package java8;
//Q.Print the Decimal value in ascending order
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDecimalValueInAscendingOrder {
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(12.4,23.4,90.4,12.1,8.9);
        List<Double> d = l.stream().sorted().collect(Collectors.toList());
        System.out.println(d);
    }
}
