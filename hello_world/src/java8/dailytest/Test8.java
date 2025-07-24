package java8.dailytest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(5,32,9,27,3,12,15,19,16);
        List<Integer> highestNumber = l.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(highestNumber);
        highestNumber= l.stream().sorted().skip(l.size()-(l.size()-3)).sorted(Comparator.reverseOrder()).toList();
        System.out.println(highestNumber+"----");

        highestNumber= l.stream().sorted().sorted(Comparator.reverseOrder()).collect(Collectors.collectingAndThen(
                Collectors.toList(),a->a.stream().limit(3).toList()
        ));
        System.out.println(highestNumber);
        List<Integer> lowestNumber = l.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(lowestNumber);




    }
}
