//Q.sort the student object based on rollnumber Natural Order (Ascending)
package collection.comparableinterfaceallcomcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    int rollNum;
    String name;

    public Student(int rollNum, String name){
        this.rollNum = rollNum;
        this.name = name;
    }

    @Override
    public int compareTo(Student stu){
      return this.rollNum - stu.rollNum;
    }

    @Override
    public String toString() {
        return rollNum + " - " + name;
    }

}

class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(1, "blice"));
        list.add(new Student(2, "aob"));

        System.out.println(list);
        Collections.sort(list); // Uses compareTo()
        System.out.println(list);
        //list.forEach(System.out::println);
    }
}