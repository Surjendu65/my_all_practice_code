package java8;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(multiply(2,3));
        System.out.println(add(2,34));
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int multiply(int a,int b){
        return a*b;
    }
}
