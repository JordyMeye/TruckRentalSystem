package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository{

    private static  CustomerRepository repository = null;
    private Set<Customer> customerDB =null;

    private CustomerRepository(){
        customerDB = new HashSet<Customer>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null){
            repository = new CustomerRepository();
        }
        return repository;
    }


    @Override
    public Customer create(Customer customer){

        boolean success = customerDB.add(customer);
        if(!success)
            return null;
        return customer;
    }

    @Override
    public Customer read(String name) {
        for(Customer c : customerDB){
            if (c.getName().equals(name))
                return c;
        }
        return null;


    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getName());
        if(oldCustomer != null){
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;

        }
        return null;
    }

    @Override
    public boolean delete() {
        return false;
    }


    public boolean delete(String name) {
        Customer customerToDelete = read(name);
        if(customerToDelete == null)
            return false;
        customerDB.remove(customerToDelete);
        return true;
    }

    @Override
    public Set<Customer> getAll() {
        return customerDB;
    }

}
