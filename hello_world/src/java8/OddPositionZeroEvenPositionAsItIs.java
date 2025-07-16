package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddPositionZeroEvenPositionAsItIs {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,5,10,9,15,25,30,25,10);
        List<Integer> oddEvenPositon = l.stream().map(x-> x%2 ==1? 0: x).collect(Collectors.toList());
        System.out.println(oddEvenPositon);

        var v = l.stream().collect(Collectors.mapping(x->x%2 == 1?0:x,Collectors.toList()));
        System.out.println(v);

        var vt = l.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
                x->x.stream().map(y->y%2==1?0:y).collect(Collectors.toList())));
        System.out.println(vt);
    }
}
