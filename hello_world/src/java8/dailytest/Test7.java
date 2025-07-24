package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,4,8,5,8);
        List<Integer> l2 = Arrays.asList(10,20,30,20,1);
        List<Integer> mergeWithOutDuplicate = Stream.concat(l1.stream(),l2.stream()).distinct()
               .toList();
        System.out.println(mergeWithOutDuplicate);

        List<Integer> mergeWithDuplicate = Stream.concat(l1.stream(),l2.stream())
               .toList();
        System.out.println(mergeWithDuplicate);



    }
}
