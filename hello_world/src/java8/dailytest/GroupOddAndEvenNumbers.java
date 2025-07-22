//Q.group odd and even numbers using Java 8
package java8.dailytest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
       Map<Boolean,List<Integer>> mp=l.stream()
               .collect(Collectors.partitioningBy(p-> p% 2 ==1,Collectors.toList()));
       System.out.println(mp);

        mp=l.stream().collect(Collectors.groupingBy(p-> p% 2 ==1,Collectors.toList()));
        System.out.println(mp);

        Map<String,List<Integer>> map=l.stream().collect(Collectors.groupingBy(p->p%2==0?"Even":"Odd",
                Collectors.toList()));
        System.out.println(map);

        System.out.println("------------------------");

        mp=l.stream().collect(Collectors.partitioningBy(p-> p% 2 ==1,
                Collectors.mapping(x->{
                    if(x%2==0)
                        return x*x;
                    return x;
                },Collectors.toList())));
        System.out.println(mp);

        mp=l.stream().collect(Collectors.groupingBy(p-> p% 2 ==1,Collectors.
                collectingAndThen(Collectors.toList(),x->x.stream().map(a->{
                    if(a%2==0){
                        return a*a;
                    }
                    return a;
                }).collect(Collectors.toList()))));
        System.out.println(mp);

        map=l.stream().map(a->{
            if(a%2==0){
                return a*a;
            }
            return a;
        }).collect(Collectors.groupingBy(p->p%2==0?"Even":"Odd",
                Collectors.toList()));
        System.out.println(map);

    }
}
