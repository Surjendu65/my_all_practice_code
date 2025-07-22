package java8;
@FunctionalInterface
public interface MyInterface {
    boolean test1 (int num);
}

 /*class Test1 implements MyInterface{
    public boolean test1 (int num){
        return num%2 == 0? true:false;
    }


}

 class Main{
    public static void main(String[] args) {
        MyInterface m = new Test1();
        System.out.println(m.test1(4));
    }
}*/

//Without lambda function
class Main1{
    public static void main(String[] args) {
        MyInterface m1 = num-> num %2==0 ? true: false;
        System.out.println(m1.test1(5));

    }
}