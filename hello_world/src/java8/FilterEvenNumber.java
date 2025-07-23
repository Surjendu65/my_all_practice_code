package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> res = l.stream().filter(x->x%2 == 0).collect(Collectors.toList());
        System.out.println(res);
    }

}
