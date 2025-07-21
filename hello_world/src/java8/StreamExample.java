package java8;

import java.util.Arrays;
import java.util.List;
public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Ravi", "Raju", "Ramesh");
        names.stream()
                .filter(name -> name.startsWith("Ra"))
                .forEach(System.out::println);
        System.out.println("Hello Hiiii junit is pending");
    }
}
