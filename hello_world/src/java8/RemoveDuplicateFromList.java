package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> remDuplicate = list.stream().distinct().collect(Collectors.toList());
        System.out.println(remDuplicate);

        var v = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(v);

        var c=list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().map(x->x.getKey())
                .collect(Collectors.toList());
        System.out.println(c);
        Set<Integer> st=new HashSet<>();
        var d=list.stream().filter(x->st.add(x))
                .collect(Collectors.toSet());
        System.out.println(d);

        var e=list.stream().collect(Collectors.toMap(a->a,a->a,(val1,val2)->
                val1));
        System.out.println(e.keySet());


    }
}
