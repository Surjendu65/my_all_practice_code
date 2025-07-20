
//Q.find the frequency of each character in a String using Java 8 Streams
package java8.dailytest;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachCharacterInAString {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        Map<String,Integer> mp=new HashMap<>();
        for(int i = 0 ; i < str.length(); i++){
            char ch=str.charAt(i);
            mp.put(ch+"",mp.containsKey(ch+"")?mp.get(ch+"")+1:1);
        }
        System.out.println(mp);

        var map= Stream.of(str.split("")).collect(Collectors.groupingBy(x->x,
                Collectors.counting()));
        System.out.println(map);

        var freq = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));;
        System.out.println(freq);

    }
}
