package Unit1;

public class MyEmp {
    static{
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
//        Employee e1 = new Employee(emp_id = 12, emp_name = "Abhishek");
//        e1.display();
        Employee.emp_info();
    }
}

