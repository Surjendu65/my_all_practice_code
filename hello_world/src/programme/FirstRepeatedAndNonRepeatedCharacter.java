package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeatedAndNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programme";

        var frepeated=Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1)
                .findFirst().get().getKey();
        System.out.println(frepeated);
        frepeated=Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(x->x,
                        LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1)
                .findFirst().get().getKey();
        System.out.println(frepeated);
        boolean bool=false;
        boolean bool1=false;
        for(int i=0;i<str.length();i++){
            int cnt=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    cnt++;
            }
            if(cnt==1 && bool==false){
                System.out.println(str.charAt(i));
                bool=true;
            }
            if(cnt>1 && bool1==false){
                System.out.println(str.charAt(i));
                bool1=true;
            }
        }


    }
}
