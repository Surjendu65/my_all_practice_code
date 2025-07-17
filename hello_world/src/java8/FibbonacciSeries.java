//Q.Find the Fibonacci series of 1st 10 elements
package java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FibbonacciSeries {
    public static void main(String[] args) {
          var fib=Stream.iterate(new int[]{0,1},x->new int[]{x[1],x[0]+x[1]})
                  .limit(10).map(a->a[0]).collect(Collectors.toList());
        System.out.println(fib);
        }
    }

