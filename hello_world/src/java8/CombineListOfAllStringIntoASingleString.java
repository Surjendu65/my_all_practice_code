//Q.We have List<String> combine all strings into a single string inside a list
package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineListOfAllStringIntoASingleString {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("java","is","a","programming","language");
        String st = s.stream().collect(Collectors.joining(" ", "[", "]"));
        System.out.println(st);
        System.out.println("---------");
        List<String> lis = List.of(s.stream().collect(Collectors.joining(" ")));
        System.out.println(lis);
    }
}
