package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String>{
    //create, read, delete
    public Set<Customer> getAll();
}
