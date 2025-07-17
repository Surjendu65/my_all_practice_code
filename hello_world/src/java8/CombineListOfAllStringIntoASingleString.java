package java8;
//Q.Print the Decimal value in ascending order
//Q.We have List<String> combine all strings into a single string inside a list
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Double> l = Arrays.asList(12.4,23.4,90.4,12.1,8.9);
        List<Double> d = l.stream().sorted().collect(Collectors.toList());

        System.out.println(d);

        List<String> s = Arrays.asList("java","is","a","programming","language");
        String st = s.stream().collect(Collectors.joining(" ", "[", "]"));
        System.out.println(st);
        System.out.println("---------");
        List<String> lis = List.of(s.stream().collect(Collectors.joining(" ")));
        System.out.println(lis);
    }
}
