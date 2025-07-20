package java8;
import java.util.function.Predicate;
public class EvenOddPredicate {
        public static void main(String[] args) {
            // Predicate to check if number is even
            Predicate<Integer> isEven = number -> number % 2 == 0;

            // Predicate to check if number is odd
            Predicate<Integer> isOdd = number -> number % 2 != 0;

            // Test numbers
            int num1 = 10;
            int num2 = 15;

            // Check and print
            System.out.println(num1 + " is even? " + isEven.test(num1)); // true
            System.out.println(num1 + " is odd? " + isOdd.test(num1));   // false

            System.out.println(num2 + " is even? " + isEven.test(num2)); // false
            System.out.println(num2 + " is odd? " + isOdd.test(num2));   // true

            System.out.println("-----------");
        }
    }


