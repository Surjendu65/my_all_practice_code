package collection.arraylist;

import java.util.ArrayList;
public class ArrayListHeterogeneousDupliacteInsertionOrderNullMultipleExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java");
        al.add("python");
        al.add("java");
        al.add(12);
        al.add(12.4);
        al.add(null);
        al.add(null);
        System.out.println(al);
    }
}
