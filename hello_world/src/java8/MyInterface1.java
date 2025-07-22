package java8;
@FunctionalInterface
public interface MyInterface1 {
        void accept(String str);
}
/*class Test1 implements MyInterface1{
    public void accept (String str) {
        System.out.println(str);
    }
}

class Main {
    public static void main(String[] args) {
        MyInterface1 m = new Test1();
        m.accept("Hello");
    }
}*/

//Without lambda function
class Main2{
    public static void main(String[] args) {
        MyInterface1 m1 = str-> System.out.println(str);
        m1.accept("Hi");
    }
}