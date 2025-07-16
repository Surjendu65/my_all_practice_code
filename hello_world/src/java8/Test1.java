//Q.Remove duplicate elements from a List<Integer> using Java 8.
package java8;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,2,3,4,5,3);
         List<Integer> res=l.stream().distinct().collect(Collectors.toList());
        System.out.println("-------");

        l.stream().distinct().forEach(System.out::println);
        System.out.println("-------");

        Set<Integer> resSet=l.stream().collect(Collectors.toSet());
        System.out.println(res);
        System.out.println(resSet);
        System.out.println("-------");

        Set<Integer> resSet1=new HashSet<>();
        l.stream().filter(x->{
            resSet1.add(x);
            return true;
        }).collect(Collectors.toList());
        System.out.println(resSet1);

        System.out.println("-------");
        Map<Integer,Long> mpp =l.stream().collect(Collectors.groupingBy(x->x
        ,Collectors.counting()));
        List<Integer> resLit=mpp.entrySet().stream().map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(resLit);

        System.out.println(mpp.entrySet());

    }
}
