package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class FibbonacciSeries {
        public static void main(String[] args) {
            var fibbonacci = Stream.iterate(new int[]{0,1}, x->new int[]{x[1],x[0]+x[1]})
                    .limit(10).map(a->a[0]).toList();
            System.out.println(fibbonacci);
            List<Integer> list= new ArrayList<>(Arrays.asList(0,1));
            for(int i=2;i<10;i++){
                list.add(list.get(i-2)+list.get(i-1));
            }
            System.out.println(list);
        }
    }

