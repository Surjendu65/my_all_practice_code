package java8.terminalmethod;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FibbonacciSeries {
    public static void main(String[] args) {
        var fibbonacci =Stream.iterate(new int[]{0,1},x->new int[]{x[1],x[0]+x[1]})
                .limit(10).map(a->a[0]).collect(Collectors.toList());
        System.out.println(fibbonacci);
    }
}
