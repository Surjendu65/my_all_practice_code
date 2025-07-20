package java8.terminalmethod;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pallindrome {
    public static void main(String[] args) {
        String str="madam";
        var result=IntStream.range(0,str.length())
                .mapToObj(x->str.charAt(str.length()-1-x)+"").collect(Collectors.joining(""))
                .equals(str);
        var res=IntStream.range(0,str.length()/2).allMatch(x->
                str.charAt(x)==str.charAt(str.length()-1-x));
        System.out.println(result+"---"+res);

    }
}
