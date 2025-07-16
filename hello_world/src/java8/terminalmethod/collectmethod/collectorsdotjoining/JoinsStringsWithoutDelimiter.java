//Q.Joins strings without any delimiter.
package java8.terminalmethod.collectmethod.collectorsdotjoining;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinsStringsWithoutDelimiter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "awesome");
        String str = words.stream().collect(Collectors.joining(""));
        System.out.println(str);
    }
}
