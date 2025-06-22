public class EmployeeManager {
    private Employee[] employees;
    private int size = 0;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
    }

   
    public void addEmployee(Employee e) {
        if (size >= employees.length) {
            System.out.println("Array is full. Cannot add more employees.");
            return;
        }
        employees[size++] = e;
    }

   
    public Employee searchEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                return employees[i];
            }
        }
        return null;
    }

    
    public void deleteEmployee(String empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Deleted employee: " + empId);
                return;
            }
        }
        System.out.println("Employee not found: " + empId);
    }

    
    public void displayAllEmployees() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
