public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Step 1: Create repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Step 2: Inject repository into service using constructor
        CustomerService service = new CustomerService(repository);

        // Step 3: Use the service
        service.displayCustomer("C101");
    }
}
