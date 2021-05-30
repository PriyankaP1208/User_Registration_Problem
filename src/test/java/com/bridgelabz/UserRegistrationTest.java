package com.bridgelabz;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.runner.JUnitCore;

public class UserRegistrationTest {
    //Testing first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("Priyanka");
        assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("pri");
        assertFalse(result);
    }

    //Testing last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("Patil");
        assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("pl");
        assertFalse(result);
    }

    //Testing email address
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validEmail("abc@yahoo.com");
        assertTrue(result);
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validEmail("abc.xyz.co.in");
        assertFalse(result);
    }

    //Testing phone number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validMobile("91 9881203930");
        assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validMobile("988120393");
        assertFalse(result);
    }

    //Testing password
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword("Priyanka@123");
        assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword("priya12");
        assertFalse(result);
    }
}
