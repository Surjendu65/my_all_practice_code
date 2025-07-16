package java8.optionalclass;

import java.util.Optional;

/*
#Optional class All method:
1. Optional.of(T value)
2. Optional.ofNullable(T value)
3. Optional.empty()
4. T get()
5. boolean isPresent()
6. boolean isEmpty() (Java 11+)
7. void ifPresent(Consumer<? super T> action)
8. void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) (Java 9+)
9. Optional<T> filter(Predicate<? super T> predicate)
10. <U> Optional<U> map(Function<? super T, ? extends U> mapper)
11. <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper)
12. T orElse(T other)
13. T orElseGet(Supplier<? extends T> supplier)
14. <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X
15. T orElseThrow() (Java 10+)
16. Stream<T> stream() (Java 9+)
17. boolean equals(Object obj)
18. int hashCode()
19. String toString()

 */
//Optional.of(T value):
//Value must not be null, if value not null, then return the given value
//If value is null,then we will get .NullPointerException
//It Accepts exactly 1 argument of type T, otherwise we will get CTE
/*public class OptionalClassAllMethodExample {
    public static void main(String[] args) {
        String str = "java";
        Optional<String> opt = Optional.of(str);
        System.out.println(opt);//Optional[java]

        //Optional<String> opt2 = Optional.of("java","python","sal");
        //System.out.println(opt2);//CTE
        Optional<String> opt1 = Optional.of(null);
        System.out.println(opt1);//NullPointerException
    }
}*/


//2. Optional.ofNullable(T value)
//Value may be null or not-null
//If value is null, then we will get Optional.empty
//If value isn't null, then we will get the given value
/*public class OptionalClassAllMethodExample {
    public static void main(String[] args) {
        Optional opt = Optional.ofNullable(null);
        System.out.println(opt);//Optional.empty
        Optional<String> opt1 = Optional.ofNullable("java");
        System.out.println(opt1);//Optional[java]
    }
}*/


//3. Optional.empty()
//Explicitly create an empty Optional
//It returns an Optional.empty
/*public class OptionalClassAllMethodExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("java");
        System.out.println(opt);//Optional.empty
    }
}*/

//4. T get()
//
public class OptionalClassAllMethodExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("java");
        System.out.println(opt.get());
    }
}