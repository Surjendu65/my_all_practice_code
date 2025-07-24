//Q. Print unique & duplicate values from list of Array
package java8.dailytest;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueAndDuplicateValuesFromListOfArrayFindOut {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,2,3,4,5,3);
        Map<Integer,Long> m = l.stream()
                .collect(Collectors.groupingBy(g->g,Collectors.counting()));
        List<Integer> unique = m.entrySet().stream().filter(x->x.getValue() ==1).map(Map.Entry::getKey).toList();
        System.out.println(unique);

        System.out.println("----------");
        Map<Integer,Long> m1 = l.stream().collect(Collectors.groupingBy(g->g,Collectors.counting()));
        List<Integer> duplicate = m1.entrySet().stream().filter(x->x.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(duplicate);

        System.out.println("--------");
        Set<Integer> st=new HashSet<>();
        List<Integer> llst=l.stream().filter(st::add).toList();
        System.out.println(llst);
    }
}
