package com.bridgelabz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    public String email;
    public boolean status;

    public ValidEmailTest(String email, boolean status) {
        this.email = email;
        this.status = status;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc", false}, {"abc@.com.my", false},
                {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}});
    }

    @Test
    public void givenEmail_ShouldPassTestCases() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.parameterizedEmail(this.email, this.status);
        assertTrue(result);
    }

}
