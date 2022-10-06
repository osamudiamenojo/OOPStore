package services;

import entities.Customer;
import entities.Product;
import services.impl.CashierServiceImpl;

public interface CustomerService {
    String buyProduct(Customer customer, Product product);
}
