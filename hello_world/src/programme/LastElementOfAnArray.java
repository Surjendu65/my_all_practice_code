package java8;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastElementOfAnArray {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,50};
        System.out.println(arr[arr.length -1 ]);

        Arrays.stream(arr).skip(arr.length -1).forEach(System.out::println);
        var c=Arrays.stream(arr).boxed().collect(Collectors.toList()).get(arr.length-1);
        System.out.println(c);

        IntStream.range(0,1).mapToObj(x->arr[arr.length-x-1]).forEach(System.out::println);


    }
}
