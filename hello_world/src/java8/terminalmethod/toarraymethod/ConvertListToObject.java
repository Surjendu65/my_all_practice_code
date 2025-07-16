
//Q.Convert a List to Object Array
package java8.terminalmethod.toarraymethod;
import java.util.Arrays;
import java.util.List;
public class ConvertListToObject {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "C++");
        System.out.println(list);
        Object[] obj = list.stream().toArray();
        System.out.println(Arrays.toString(obj));
    }
}