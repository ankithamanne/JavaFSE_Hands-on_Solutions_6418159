interface CustomerRepository {
    String findCustomerById(int id);
}
class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        return "Customer" + id;
    }
}
class CustomerService {
    CustomerRepository repo;
    CustomerService(CustomerRepository r) { repo = r; }
    void getCustomer(int id) { System.out.println(repo.findCustomerById(id)); }
}
public class Main {
    public static void main(String[] args) {
        CustomerService s = new CustomerService(new CustomerRepositoryImpl());
        s.getCustomer(2);
    }
}