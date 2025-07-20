
package java8.dailytest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,5,10,9,15,25,30,25,10);
        int min = l.stream().min(Integer::compareTo).get();
        System.out.println(min);

        System.out.println();

        min = l.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println(min);

        min = l.stream().sorted().findFirst().get();
        System.out.println(min);
        min = l.stream().sorted().collect(Collectors.toList()).get(0);
        System.out.println(min);
        int max=l.stream().max(Integer::compareTo).get();
        System.out.println(max);
        max=l.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.println(max);
        max=l.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);
        max=l.stream().sorted().collect(Collectors.toList()).get(l.size()-1);
        System.out.println(max);
        max=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);
        System.out.println(max);


    }
}
