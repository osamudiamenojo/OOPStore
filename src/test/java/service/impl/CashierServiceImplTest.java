package service.impl;

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
    Customer testCustomer = new Customer("John", Gender.MALE, BigInteger.valueOf(8000));
    Product testProduct =new Product("earpiece", "P13", BigInteger.valueOf(1000), 6, Category.TECH);



    @Test
    void dispenseReceipt() {
        String whenTestCashierDispensesReceipt = testCashier.dispenseReceipt(testCustomer, testProduct);
        String resultOfDispensingReceipt = new Receipt(testCustomer.getName(), testProduct.getPrice()).toString();
        assertEquals(resultOfDispensingReceipt, whenTestCashierDispensesReceipt);
    }

    @Test
    void sellProduct() {
        String whenTestCashierSells = testCashier.sellProduct(testCustomer, testProduct);
        String ResultOfSelling = "Your order has been delivered";


        assertEquals(ResultOfSelling, whenTestCashierSells);

    }
}