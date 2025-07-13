class Employee {
    int employeeId;
    String name, position;
    double salary;

    Employee(int id, String n, String pos, double sal) {
        employeeId = id;
        name = n;
        position = pos;
        salary = sal;
    }

    public String toString() {
        return employeeId + " | " + name + " | " + position + " | " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        // Add employees
        employees[0] = new Employee(1, "Anil", "Manager", 55000);
        employees[1] = new Employee(2, "Sunita", "HR", 40000);

        // Traverse and display
        for (Employee e : employees) {
            if (e != null)
                System.out.println(e);
        }

        // Search by ID
        int searchId = 1;
        for (Employee e : employees) {
            if (e != null && e.employeeId == searchId) {
                System.out.println("Found: " + e);
                break;
            }
        }
    }
}
