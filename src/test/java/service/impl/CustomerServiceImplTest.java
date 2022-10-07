package service.impl;

import entities.Customer;
import entities.Product;
import enums.Category;
import enums.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Store;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    Store testStore = new Store();
    CashierServiceImpl testCashier;
    CustomerServiceImpl customerService;
    Customer testCustomer;
    Product testProduct;

    @BeforeEach
    void setUp() {

    }


    //    void setUp() {
//        testCashier = new CashierServiceImpl();
//        testStore=new Store();
//        testStore.csvReader();
//        testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(8000));
//        testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);
//    }


    @Test
    void buyProduct() {
        CustomerServiceImpl testCustomerService = new CustomerServiceImpl();
        testCashier = new CashierServiceImpl();
        testStore=new Store();
        testStore.csvReader();
        testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(8000));
        testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);

        testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(8000));
        testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);


        String afterBuyingProduct = testCustomerService.buyProduct(testCustomer, testProduct);
        String actualResultOfBuying = testCashier.sellProduct(testCustomer, testProduct, testStore);
        assertEquals(actualResultOfBuying, afterBuyingProduct);

    }
}