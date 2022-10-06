package services.impl;

import entities.Customer;
import entities.Product;
import entities.Receipt;
import enums.Category;
import enums.Gender;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CashierServiceImplTest {
    CashierServiceImpl testCashier = new CashierServiceImpl();
    Customer testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(1200));
    Product testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);



    @Test
    void dispenseReceipt() {
        String whenTestCashierDispensesReceipt = testCashier.dispenseReceipt(testCustomer, testProduct);
        String expectedResultOfDispensingReceipt = new Receipt(testCustomer.getName(), testProduct.getPrice()).toString();
        assertEquals(expectedResultOfDispensingReceipt, whenTestCashierDispensesReceipt);
    }

    @Test
    void sellProduct() {
        String whenTestCashierSells = testCashier.sellProduct(testCustomer, testProduct);
        String actualResultOfSelling = "Your order has been delivered";


        assertEquals(actualResultOfSelling, whenTestCashierSells);

    }
}