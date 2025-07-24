package java8.dailytest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Test11 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("java","python","c++");
        List<String> sil=  l.stream().sorted(Comparator.comparing(String::length))
               .toList();
        System.out.println(sil);
       List<String> s3 =  l.stream().sorted((s1,s2)-> s1.length() - s2.length())
                .toList();
        System.out.println(s3);

        List<Integer> s=  l.stream().map(x->x.length()).sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(s);

    }
}
