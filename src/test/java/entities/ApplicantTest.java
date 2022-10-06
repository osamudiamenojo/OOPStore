package entities;

import enums.Gender;
import enums.Qualification;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    @org.junit.jupiter.api.Test
    void apply() {
        Applicant testApplicant =new Applicant("Success", Gender.MALE, Qualification.OND);
        assertEquals(testApplicant.getName() + " has applied", testApplicant.apply());

    }
}