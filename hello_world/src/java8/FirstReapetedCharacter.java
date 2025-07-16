package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class FirstReapetedCharacter {
    public static void main(String[] args) {
        String str = "programme";

        var fst= Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(a->a.getValue()==1)
                        .findFirst().get().getKey();
        var scnd= Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                        LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1)
                .findFirst().get().getKey();
        System.out.println(fst+"---"+scnd);

        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(str.charAt(i)+"---");
                break;
            }
        }
        var ky="";
        var vl=0;
        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt++;
                }
            }
            if (cnt >vl) {
                vl=cnt;
                ky=str.charAt(i)+"";
            }
        }

        System.out.println(ky);

        String st="ROTATORA";
        var rs=IntStream.range(0,st.length()/2)
                .allMatch(x->st.charAt(x)==st.charAt(st.length()-1-x));
        System.out.println(rs);
        var cc=IntStream.range(0,st.length())
                .mapToObj(x->st.charAt(st.length()-1-x)+"").collect(Collectors.joining());
        System.out.println(cc.equals(st));
        boolean flag=true;
        for(var i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                flag=false;
                break;
            }
        }
        System.out.println(flag?"Pallindrome":"Not Pallindorme");
       List<Integer> l = Arrays.asList(1,2,3,4,5,6);
       List<Integer> li = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println(li);

       int[] arr = {10,20,30,40,50,60};
       int[] arr2 = IntStream.range(0,arr.length).map(i -> arr[arr.length -1- i])
               .toArray();
        System.out.println(Arrays.toString(arr2));









    }
}
