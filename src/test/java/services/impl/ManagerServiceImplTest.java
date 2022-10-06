package services.impl;

import entities.Applicant;
import entities.Staff;
import enums.Gender;
import enums.Qualification;
import enums.Role;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServiceImplTest {

    @Test
    void hireACashier() {
        ManagerServiceImpl managerService = new ManagerServiceImpl();
        Staff manager = new Staff("Daniel", Gender.MALE, UUID.randomUUID().toString(), Role.MANAGER, Qualification.MSC);
        Applicant testApplicant = new Applicant("Cobb", Gender.MALE, Qualification.BSC);
        testApplicant.apply();
        String hiringAManager = managerService.hireACashier(manager, testApplicant);
        assertEquals(testApplicant.getName() + " is now a cashier", hiringAManager);


    }
}