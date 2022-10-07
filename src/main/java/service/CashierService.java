package service;

import entities.Customer;
import entities.Product;
import utils.Store;

public interface CashierService {
     String sellProduct(Customer customer, Product product, Store store);
     String dispenseReceipt(Customer customer, Product product);

}
