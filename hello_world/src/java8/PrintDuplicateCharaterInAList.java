package java8;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateCharaterInAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("p", "r", "o", "g", "r", "a", "m", "m", "e","o");
        Map<String, Long> m = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        List<String> dupChar = m.entrySet().stream().filter(x->x.getValue()> 1).map(Map.Entry::getKey).toList();
        System.out.println(dupChar);
        Set<String> st=new HashSet<>();
        var dup=list.stream().filter(x->!st.add(x)).toList();
        System.out.println(dup);

        List<String> list1=new ArrayList<>();
        var dup1=list.stream().filter(x->{
            if(list1.contains(x))
                return true;
            else{
                list1.add(x);
                return false;
            }
        }).toList();
        System.out.println(dup1);


    }
}
