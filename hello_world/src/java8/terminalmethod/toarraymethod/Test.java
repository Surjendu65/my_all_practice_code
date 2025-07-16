package java8.terminalmethod.toarraymethod;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");
         List<String> l = list.stream().map(x->x).collect(Collectors.toList());
        System.out.println("---------");
        System.out.println(l);
    }
}



