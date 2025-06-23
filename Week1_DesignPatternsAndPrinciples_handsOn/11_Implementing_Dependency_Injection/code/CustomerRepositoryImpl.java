public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulating a customer record retrieval
        return new Customer(id, "Preethi");
    }
}
