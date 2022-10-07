import entities.*;
import enums.Category;
import enums.Gender;
import enums.Qualification;
import enums.Role;
import service.CashierService;
import service.ManagerService;
import service.impl.CashierServiceImpl;
import service.impl.CustomerServiceImpl;
import service.impl.ManagerServiceImpl;
import utils.Store;

import java.math.BigInteger;
import java.util.UUID;

public class Main {
    private final static ManagerService managerService = new ManagerServiceImpl();
    private final static CashierService cashierService = new CashierServiceImpl();
    private final static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private final static Store storeInitializer = new Store();



    public static void main(String[] args) {

        storeInitializer.csvReader();



        ManagerServiceImpl managerService = new ManagerServiceImpl();

        Applicant applicant1 = new Applicant("Dotun", Gender.MALE, Qualification.BSC);
        Product product1 = new Product("milk","P1", BigInteger.valueOf(220),
                5, Category.BEVERAGES);
        Customer customer1 = new Customer("Victor", Gender.MALE, BigInteger.valueOf(5000));
        Staff manager = new Staff("Dele", Gender.MALE, UUID.randomUUID().toString(),
                Role.MANAGER, Qualification.MSC);

        applicant1.apply();
        String hireCashierResult = managerService.hireACashier(manager, applicant1);
        System.out.println(hireCashierResult);

        String buyProductResult = customerService.buyProduct(customer1, product1);
        System.out.println(buyProductResult);
        String dispenseReceiptResult = cashierService.dispenseReceipt(customer1, product1);
        System.out.println(dispenseReceiptResult);


    }
}
