package services.impl;

import entities.Customer;
import entities.Product;
import services.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    public CashierServiceImpl getCashierService() {
        return cashierService;
    }

    private CashierServiceImpl cashierService = new CashierServiceImpl();

    @Override
    public String buyProduct(Customer customer, Product product) {
        if (product==null) {
            throw new NullPointerException("product cannot be null");
        }
        return cashierService.sellProduct(customer, product);
    }
}
