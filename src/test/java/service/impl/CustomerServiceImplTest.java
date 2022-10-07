package service.impl;

import entities.Customer;
import entities.Product;
import enums.Category;
import enums.Gender;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    CashierServiceImpl testCashier = new CashierServiceImpl();
    CustomerServiceImpl customer = new CustomerServiceImpl();
    Customer testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(6000));
    Product testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 5, Category.TECH);

    @Test
    void buyProduct() {
        String afterBuyingProduct = customer.buyProduct(testCustomer, testProduct);
        String actualResultOfBuying = testCashier.sellProduct(testCustomer, testProduct);
        assertEquals(actualResultOfBuying, afterBuyingProduct);

    }
}