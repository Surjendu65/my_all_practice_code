package java8.optionalclass;

import java.util.Optional;
//Optional.of(T value):
//Value must not be null, if value not null, then return the given value
//If value null,then we will get .NullPointerException
//It Accepts exactly 1 argument of type T, otherwise we will get CTE
public class OptionalCreationExample {
    public static void main(String[] args) {
        String str = "java";
        Optional<String> opt = Optional.of(str);
        System.out.println(opt);//Optional[java]

        //Optional<String> opt2 = Optional.of("java","python","sal");
        //System.out.println(opt2);//CTE
        Optional<String> opt1 = Optional.of(null);
        System.out.println(opt1);//NullPointerException
    }
}


//2. Optional.ofNullable(T value)
//Value may be null or not-null
//If value is null, then we will get Optional.empty
//If value isn't null, then we will get the given value
/*
import java.util.Optional;
public class OptionalCreationExample {
    public static void main(String[] args) {
        Optional opt = Optional.ofNullable(null);
        System.out.println(opt);
        Optional<String> opt1 = Optional.ofNullable("java");
        System.out.println(opt1);
    }
}*/

//3. Optional.empty()
//Explicitly create an empty Optional
/*
import java.util.Optional;
public class OptionalCreationExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("java");
        System.out.println(opt);//Optional.empty
    }
}*/
