//Q.Print the elements from the List which is divisible by 5
package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,5,10,9,15,25,30,25,10);
        List<Integer> result =  l.stream().filter(x->x % 5 == 0).toList();
        System.out.println(result);

        System.out.println("----------");
        result =  l.stream().map(x->x+"").filter(x->x.endsWith("0")
        || x.endsWith("5")).map(Integer::valueOf).toList();
        System.out.println(result);

        System.out.println("-------");
        result =  l.stream().collect(Collectors.filtering(x->x%5==0,Collectors.toList()));
        System.out.println(result);

        System.out.println("--------");
        result =  l.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
                x->x.stream().filter(a->a%5==0).toList()));
        System.out.println(result);


    }
}
