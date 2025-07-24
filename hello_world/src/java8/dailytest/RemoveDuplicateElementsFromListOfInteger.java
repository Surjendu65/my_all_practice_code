//Q.Remove duplicate elements from a List<Integer> using Java 8.
package java8.dailytest;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,2,3,4,5,3);
         List<Integer> res=l.stream().distinct().toList();

         //Approach:2
        l.stream().distinct().forEach(System.out::println);

        //Approach:3
        Set<Integer> resSet=l.stream().collect(Collectors.toSet());
        System.out.println(res);
        System.out.println(resSet);

        //Approach:4
        Set<Integer> resSet1=new HashSet<>();
        l.stream().filter(x->{
            resSet1.add(x);
            return true;
        }).forEach(x -> {});
        System.out.println(resSet1);

        //Approach:5
        Map<Integer,Long> mpp =l.stream().collect(Collectors.groupingBy(x->x
        ,Collectors.counting()));
        List<Integer> resLit=mpp.entrySet().stream().map(Map.Entry::getKey).toList();
        System.out.println(resLit);

        System.out.println(mpp.entrySet());

    }
}
