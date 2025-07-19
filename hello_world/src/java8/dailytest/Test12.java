package java8.dailytest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test12 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        int s = l.stream().mapToInt(Integer::intValue).sum();
        System.out.println(s);
         var sm=l.stream().collect(Collectors.summingInt(Integer::intValue));
         var avgsm=l.stream().collect(Collectors.averagingInt(Integer::intValue));
         System.out.println(sm+"---->"+avgsm);
        OptionalDouble av = l.stream().mapToInt(Integer::intValue).average();
        System.out.println(av);

        List<Integer> l1 = Arrays.asList(10,20,4,5);
        List<Integer> l2 = Arrays.asList(1,20,3,4,10);
        List<Integer> res = l1.stream().filter(l2::contains).collect(Collectors.toList());
        System.out.println(res);

        Set<Integer> st = new HashSet<>(l2);
        List<Integer> sres = l1.stream().filter(st::contains).collect(Collectors.toList());
        System.out.println(sres);

     String str="Java is Good Programming Language";
     String resString=Arrays.asList(str.split(" "))
             .stream().map(x->new StringBuffer(x).reverse().toString())
             .collect(Collectors.joining(" "));
        System.out.println(resString);

        resString=Arrays.asList(str.split(" "))
                .stream().map(x->{
                    String rs="";
                    for(int i=x.length()-1;i>=0;i--){
                        rs=rs+x.charAt(i);
                    }
                    return rs;
                })
                .collect(Collectors.joining(" "));
        System.out.println(resString);

        resString=Arrays.asList(str.split(" "))
                .stream().map(x->{
                   String ss="";
                   return IntStream.range(0,x.length())
                           .mapToObj(a->x.charAt(x.length()-a-1)+"").
                           collect(Collectors.collectingAndThen(Collectors.toList(),
                                   a->a.stream().collect(Collectors.joining())));
                })
                .collect(Collectors.joining(" "));
        System.out.println(resString);

    }
}
