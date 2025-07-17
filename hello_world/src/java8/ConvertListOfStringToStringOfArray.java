//Q.To convert a List of String to a String of array
package java8;

import java.util.Arrays;
import java.util.stream.Stream;
public class Test {
    public static void main(String[] args) {
        String[] names = Stream.of("A", "B").toArray(String[]::new);
        System.out.println(Arrays.toString(names));
        int[] i = {10,20,30,30};
        System.out.println(Arrays.toString(i));
    }
}
