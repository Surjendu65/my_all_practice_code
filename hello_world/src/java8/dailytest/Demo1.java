package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,5,10,9,15,25,30,25,10);
        Map<Boolean, List<Integer>> even2 = l.stream().collect(Collectors.partitioningBy(x->x%2 == 0,Collectors.toList()));
        System.out.println(even2);

        System.out.println("----------");



    }
}
