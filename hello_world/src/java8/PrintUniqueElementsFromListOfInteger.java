package java8;

import java.util.*;
import java.util.stream.Collectors;

public class PrintUniqueElementsFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 10);
        Map<Integer,Long> m = numbers.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));

        List<Integer> unique = m.entrySet().stream().filter(x->x.getValue()==1)
                .map(x-> x.getKey()).collect(Collectors.toList());
        System.out.println(unique);
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<numbers.size();i++){
            int cnt=0;
            boolean flag=false;
            for(int j=i;j<numbers.size();j++){
                if(numbers.get(i)==numbers.get(j)){
                    cnt++;
                }
            }
            for(int k=0;k<i;k++){
                if(numbers.get(i)==numbers.get(k)){
                    flag=true;
                    break;
                }
            }
            if(flag==false && cnt==1){
                System.out.println(numbers.get(i)+"--->");
            }
        }
    }
}
