package service.impl;

import entities.Customer;
import entities.Product;
import service.CustomerService;
import utils.Store;

public class CustomerServiceImpl implements CustomerService {

    public CashierServiceImpl getCashierService() {
        return cashierService;
    }
    private CashierServiceImpl cashierService = new CashierServiceImpl();
    //private Customer customer = new Customer();
    private Store store = new Store();

    @Override
    public String buyProduct(Customer customer, Product product) {
        if (customer == null || product == null) {
            throw new NullPointerException("product or customer cannot be null");
        }
        return cashierService.sellProduct(customer, product, store);
    }
}
