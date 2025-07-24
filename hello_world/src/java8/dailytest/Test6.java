
package java8.dailytest;
import java.util.*;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        final String LIST_EMPTY_MESSAGE = "List is empty";
        List<Integer> l = Arrays.asList(1,5,10,9,15,25,30,25,10);
        Optional<Integer> mina = l.stream().min(Integer::compareTo);
        System.out.println(mina.isPresent()?mina.get():0);

        System.out.println();

        int min = l.stream().collect(Collectors.minBy(Comparator.naturalOrder())).orElseThrow(() -> new NoSuchElementException(LIST_EMPTY_MESSAGE));
        System.out.println(min+"----");

        min = l.stream().sorted().findFirst().orElseThrow(() -> new NoSuchElementException(LIST_EMPTY_MESSAGE));
        System.out.println(min);
        min = l.stream().sorted().toList().get(0);
        System.out.println(min);
        int max=l.stream().max(Integer::compareTo).orElseThrow(() -> new NoSuchElementException(LIST_EMPTY_MESSAGE));
        System.out.println(max);
        max=l.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).orElseThrow(() -> new NoSuchElementException(LIST_EMPTY_MESSAGE));
        System.out.println(max);
        max=l.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow(() -> new NoSuchElementException(LIST_EMPTY_MESSAGE));
        System.out.println(max);
        max=l.stream().sorted().toList().get(l.size()-1);
        System.out.println(max);
        max=l.stream().sorted(Comparator.reverseOrder()).toList().get(0);
        System.out.println(max);
    }
}
