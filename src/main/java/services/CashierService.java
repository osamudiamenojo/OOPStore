package services;

import entities.Customer;
import entities.Product;
import entities.Receipt;

public interface CashierService {
     String sellProduct(Customer customer, Product product);
     String dispenseReceipt(Customer customer, Product product);

}
