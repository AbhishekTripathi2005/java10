package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Student> stobj = new ArrayList<>();
        stobj.add(new Student(21,78,"Vijay"));
        stobj.add(new Student(20,79,"Rahul"));
        stobj.add(new Student(22,80,"Abhi"));
        stobj.add(new Student(19,81,"Gyan"));
        stobj.add(new Student(23,82,"Ramesh"));
        Collections.sort(stobj);
        for(Student s: stobj) {
            System.out.println("Name: "+s.name+" Age: "+s.age+" RollNo: " +s.rollNo);
        }
    }
}
