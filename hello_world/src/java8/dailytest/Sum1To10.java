package java8.dailytest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sum1To10 {
    public static void main(String[] args) {
       int s = IntStream.rangeClosed(0,10).sum();
        System.out.println(s);

        var s1 = IntStream.rangeClosed(0,10).reduce(0,(a, b) -> a+b);
        System.out.println(s1);

        var s2=Stream.iterate(1,x->x+1).limit(10)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(s2);
        s2=IntStream.range(1,11).sum();
        System.out.println(s2);

        List<Integer> list=IntStream.range(1,11).mapToObj(Integer::valueOf)
                .toList();
        System.out.println(list);
        var d=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(d);
    }
}
