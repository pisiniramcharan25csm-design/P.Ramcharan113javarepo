class Employee {
    // ── Instance variables ──
    int    empId;
    String name;
    double salary;

    // ── Constructor ──
    Employee(int id, String n, double sal) {
        empId  = id;
        name   = n;
        salary = sal;
    }

    // ── Instance method ──
    void display() {
        System.out.printf("ID: %d | Name: %s | Salary: %.2f%n", empId, name, salary);
    }

    // ── Static method ──
    static void companyName() {
        System.out.println("ANITS Engineering College");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Employee e1 = new Employee(101, "Ravi", 45000.0);
        Employee e2 = new Employee(102, "Priya", 52000.0);

        e1.display();
        e2.display();
        Employee.companyName(); // static method via class name
    }
}