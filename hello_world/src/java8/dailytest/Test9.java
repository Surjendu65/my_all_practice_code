package java8.dailytest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        int num = 12345;
        String str1="peek";
        String str2="keepe";
        String sort1=Arrays.asList(str1.split("")).stream().sorted().collect(Collectors.joining());
        String sort2=Arrays.asList(str2.split("")).stream().sorted().collect(Collectors.joining());
        boolean b=IntStream.range(0,sort1.length()).allMatch(
                x->sort1.charAt(x)==sort2.charAt(x)
        );
        Map<String,Long> map =Arrays.asList(str1.split("")).stream().sorted().
                collect(Collectors.groupingBy(x->x,Collectors.counting()));
        Map<String,Long> map1 =Arrays.asList(str2.split("")).stream().sorted().
                collect(Collectors.groupingBy(x->x,Collectors.counting()));
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(map.size()!=map1.size()){
                if(map.get(ch+"")!=map1.get(ch+"")){
                    System.out.println("Not Anagram");
                    break;
                }
            }
            if(map.get(ch+"")!=map1.get(ch+"")){
                System.out.println("Not Anagram");
                break;
            }
        }
        System.out.println("Anagram");
        boolean flag=false;
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch+"")){
                flag=true;
                System.out.println("Not Anagram");
                break;
            }else if(map.containsKey(ch+"") && map.get(ch+"")==0){
                System.out.println("Not Anagram");
                flag=true;
                break;
            }else{
                map.put(ch+"",map.get(ch+"")-1);
            }

        }
        if(flag==false)
        System.out.println("Anagram");


        System.out.println(b?"Anagram":"Not Anagaram");
        int s = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt)
                        .sum();
        var c= Arrays.asList((num+"").split("")).stream().mapToInt(Integer::parseInt)
                        .reduce(0,(s1,s2)->s1+s2);

        System.out.println(s+"----"+c+"----->");




    }
}
