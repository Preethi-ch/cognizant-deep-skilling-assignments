public class EmployeeSystemTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

      
        manager.addEmployee(new Employee("E001", "Alice", "Manager", 90000));
        manager.addEmployee(new Employee("E002", "Bob", "Developer", 70000));
        manager.addEmployee(new Employee("E003", "Charlie", "Designer", 60000));

    
        System.out.println("All Employees:");
        manager.displayAllEmployees();

        
        System.out.println("\nSearch Employee E002:");
        Employee e = manager.searchEmployee("E002");
        System.out.println(e != null ? e : "Not found");

       
        System.out.println("\nDelete Employee E002:");
        manager.deleteEmployee("E002");

      
        System.out.println("\nFinal Employee List:");
        manager.displayAllEmployees();
    }
}
