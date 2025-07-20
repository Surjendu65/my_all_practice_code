package java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10OddAndEvenNumber {
    public static void main(String[] args) {
        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println);

        System.out.println("----First 10 odd number------");
        Stream.iterate(1,x->x+2).limit(10).forEach(System.out::println);

        var list=IntStream.iterate(0,x->x+2).limit(10)
                .boxed().collect(Collectors.toList());
        System.out.println(list);
        list=IntStream.iterate(1,x->x+2).limit(10)
                .boxed().collect(Collectors.toList());
        System.out.println(list);


    }
}
