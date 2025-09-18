package Unit3;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int rollNo;

    public int compareTo(Student st){
        if(age == st.age)
            return 0;
        else if(age > st.age)
            return 1;
        else
            return -1;
    }

    public Student(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }
}
