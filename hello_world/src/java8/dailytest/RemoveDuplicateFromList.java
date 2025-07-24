package java8.dailytest;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> remDuplicate = list.stream().distinct().toList();
        System.out.println(remDuplicate);

        var v = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(v);

        var c=list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().map(Map.Entry::getKey)
                .toList();
        System.out.println(c);
        Set<Integer> st=new HashSet<>();
        var d=list.stream().filter(st::add)
                .collect(Collectors.toSet());
        System.out.println(d);

        var e=list.stream().collect(Collectors.toMap(a->a,a->a,(val1,val2)->
                val1));
        System.out.println(e.keySet());


    }
}
