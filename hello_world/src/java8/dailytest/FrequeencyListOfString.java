package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrequeencyListOfString {
    public static void main(String[] args) {
        List<String> lis = Arrays.asList("java is a Good programming lnaguage");
        var v = lis.stream().flatMap(x->Arrays.stream(x.split(" ")))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(v);
        System.out.println("----------");
        List<String> lis1 = lis.stream().map(String::toLowerCase).toList();
        var v1 = lis1.stream().flatMap(x->Arrays.stream(x.split(" ")))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(v1);


    }
}
