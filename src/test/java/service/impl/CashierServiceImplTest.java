package service.impl;

import entities.Customer;
import entities.Product;
import entities.Receipt;
import enums.Category;
import enums.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Store;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImplTest {
    Store storeInitializer;
    CashierServiceImpl testCashier;
    Customer testCustomer;
    Product testProduct;

    @BeforeEach
    void setUp() {
        testCashier = new CashierServiceImpl();
        storeInitializer=new Store();
        storeInitializer.csvReader();
        testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(8000));
        testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);
    }

    @Test
    void dispenseReceipt() {
        String whenTestCashierDispensesReceipt = testCashier.dispenseReceipt(testCustomer, testProduct);
        String resultOfDispensingReceipt = new Receipt(testCustomer.getName(), testProduct.getPrice()).toString();
        assertEquals(resultOfDispensingReceipt, whenTestCashierDispensesReceipt);
    }

    @Test
    void sellProduct() {
        String whenTestCashierSells = testCashier.sellProduct(testCustomer, testProduct, storeInitializer);
        String ResultOfSelling = "Your order has been delivered";
        assertEquals(ResultOfSelling, whenTestCashierSells);

    }
}