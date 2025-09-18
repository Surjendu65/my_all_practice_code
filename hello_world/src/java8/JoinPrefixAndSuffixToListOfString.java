
package java8.dailypractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JoinPrefixAndSuffixToListOfString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "awesome");
        words.stream().collect(Collectors.joining("","[","]"));
        System.out.println(words);
    }
}
