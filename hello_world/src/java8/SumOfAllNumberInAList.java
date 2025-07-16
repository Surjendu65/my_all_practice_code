package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllNumberInAList {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(1,2,3,4,5);
        var sm = lis.stream().map(x->x).collect(Collectors.summingInt(x->x));
        System.out.println(sm);
        var sm2 = lis.stream().mapToInt(x->x).sum();
        System.out.println(sm2);

    }
}
