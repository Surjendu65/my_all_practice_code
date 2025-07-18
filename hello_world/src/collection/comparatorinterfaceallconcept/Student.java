//Q.sort the student object based on rollnumber Natural Order (Ascending)
package collection.comparatorinterfaceallconcept;
import java.util.*;
public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
    Comparator<Student> sortById = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.rollNo, s2.rollNo);
        }
    };
}


 class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        System.out.println(students);

        // Sort by ID
        students.sort(Comparator.comparingInt(s -> s.rollNo));
        System.out.println(students);

    }
}
