package java8.dailytest;
/*import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;*/
/*public class FirstReapetedCharacter {
    public static void main(String[] args) {
        String str = "programme";

        var fst= Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(a->a.getValue()==1)
                        .findFirst() .orElseThrow(() -> new RuntimeException("No non-repeating character found"))
                        .getKey();
        var scnd= Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                        LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(a->a.getValue()>1)
                .findFirst().orElseThrow(() -> new RuntimeException("No non-repeating character found"))
                .getKey();
        System.out.println(fst+"---"+scnd);

        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(str.charAt(i)+"---");
                break;
            }
        }
        var ky="";
        var vl=0;
        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    cnt++;
                }
            }
            if (cnt >vl) {
                vl=cnt;
                ky=str.charAt(i)+"";
            }
        }

        System.out.println(ky);

        String st="ROTATORA";
        var rs=IntStream.range(0,st.length()/2)
                .allMatch(x->st.charAt(x)==st.charAt(st.length()-1-x));
        System.out.println(rs);
        var cc=IntStream.range(0,st.length())
                .mapToObj(x->st.charAt(st.length()-1-x)+"").collect(Collectors.joining());
        System.out.println(cc.equals(st));
        boolean flag=true;
        for(var i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                flag=false;
                break;
            }
        }
        System.out.println(flag?"Pallindrome":"Not Pallindorme");
       List<Integer> l = Arrays.asList(1,2,3,4,5,6);
       List<Integer> li = l.stream().sorted(Comparator.reverseOrder()).toList();
       System.out.println(li);

       int[] arr = {10,20,30,40,50,60};
       int[] arr2 = IntStream.range(0,arr.length).map(i -> arr[arr.length -1- i])
               .toArray();
        System.out.println(Arrays.toString(arr2));


    }
}*/

import java.util.*;
import java.util.stream.*;
public class FirstReapetedCharacter {
    public static void main(String[] args) {
        String str = "programme";

        String firstUnique = getFirstUniqueCharacter(str);
        String firstRepeated = getFirstRepeatedCharacter(str);
        System.out.println(firstUnique + "---" + firstRepeated);

        printFirstNonRepeatingUsingLoop(str);
        System.out.println(getMostRepeatedChar(str));

        String st = "ROTATORA";
        checkPalindromeMethods(st);

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> reversedList = reverseSortList(l);
        System.out.println(reversedList);

        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] reversedArray = reverseIntArray(arr);
        System.out.println(Arrays.toString(reversedArray));
    }

    private static String getFirstUniqueCharacter(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(a -> a.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeating character found"))
                .getKey();
    }

    private static String getFirstRepeatedCharacter(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(a -> a.getValue() > 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No repeated character found"))
                .getKey();
    }

    private static void printFirstNonRepeatingUsingLoop(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(c + "---");
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }

    private static String getMostRepeatedChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return freq.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(e -> e.getKey().toString())
                .orElse("");
    }

    private static void checkPalindromeMethods(String st) {
        boolean method1 = IntStream.range(0, st.length() / 2)
                .allMatch(i -> st.charAt(i) == st.charAt(st.length() - 1 - i));
        System.out.println(method1);

        String reversed = IntStream.range(0, st.length())
                .mapToObj(i -> st.charAt(st.length() - 1 - i) + "")
                .collect(Collectors.joining());
        System.out.println(reversed.equals(st));

        boolean method3 = true;
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
                method3 = false;
                break;
            }
        }
        System.out.println(method3 ? "Palindrome" : "Not Palindrome");
    }

    private static List<Integer> reverseSortList(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .toList(); // Java 16+
    }

    private static int[] reverseIntArray(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
    }
}
