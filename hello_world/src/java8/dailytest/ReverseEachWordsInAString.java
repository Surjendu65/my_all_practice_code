package java8.dailytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWordsInAString {
    public static void main(String[] args) {
        String str = "java is a programming language";
        List<String> list=Arrays.asList(str.split(" "));
        var v = Arrays.stream(str.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(v);
        v = Arrays.stream(str.split(" "))
                .map(word-> {
                    var ss="";
                    for(var i=word.length()-1;i>=0;i--){
                        ss=ss+word.charAt(i);
                    }
                    return ss;
                })
                .collect(Collectors.joining(" "));
        System.out.println(v);

        var resString=IntStream.range(0,list.size())
                .mapToObj(x->list.get(x))
                .reduce("",(a,b)->{
                   return a+" "+new StringBuffer(b).reverse().toString().trim();
                });
        System.out.println(resString);

        resString=IntStream.range(0,list.size())
                .mapToObj(x->new StringBuffer(list.get(x)).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(resString);


    }
}
