package java8.dailytest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(12,2,45,6,78,90);
        var shg = l.stream().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(shg);
        shg = l.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).get(1);
        System.out.println(shg);
       var shigh=0;
       int fhigh=0;
       for(Integer it:l){
         if(fhigh<it){
             shigh=fhigh;
             fhigh=it;
         }else if(shigh<it){
             shigh=it;
         }
       }
        System.out.println(shigh);
    }
}
