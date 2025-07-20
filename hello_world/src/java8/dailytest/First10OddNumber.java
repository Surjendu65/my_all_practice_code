package java8.dailytest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10OddNumber {
    public static void main(String[] args) {
         Stream.iterate(1, x->x+2)
                .limit(10)
                 .forEach(System.out::println);

         IntStream.range(1,Integer.MAX_VALUE)
                 .filter(x->x%2!=0).limit(10).forEach(System.out::println);
    }
}
