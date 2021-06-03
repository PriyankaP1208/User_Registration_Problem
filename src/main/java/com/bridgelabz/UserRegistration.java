package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePatter = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
    String mobilePattern = "^[0-9]{2} [0-9]{10}$";
    String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,32}$";

    //Validate first name
    public boolean validFirstName(String fname) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(namePatter);
        try {
            if (check.test(fname)) {
                System.out.println("Valid First Name");
                return true;
            } else {
                throw new UserRegistrationException("Invalid first name");
            }
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid first name");
        }
    }

    //Validate last name
    public boolean validLastName(String lname) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(namePatter);
        try {
            if (check.test(lname)) {
                System.out.println("Valid last Name");
                return true;
            } else {
                throw new UserRegistrationException("Invalid last name");
            }
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid last name");
        }
    }

    //Validate email address
    public boolean validEmail(String email) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(emailPattern);
        try {
            if (check.test(email)) {
                System.out.println("Valid email");
                return true;
            } else {
                throw new UserRegistrationException("Invalid email");
            }
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid email");
        }
    }

    //Validate phone number
    public boolean validMobile(String phoneNo) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(mobilePattern);
        try {
            if (check.test(phoneNo)) {
                System.out.println("Valid mobile number");
                return true;
            } else {
                throw new UserRegistrationException("Invalid mobile number");
            }
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid mobile number");
        }
    }

    //validate password
    public boolean validPassword(String password) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(passwordPattern);
        try {
            if (check.test(password)) {
                System.out.println("Valid Password");
                return true;
            } else {
                throw new UserRegistrationException("Invalid password");
            }
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid password");
        }
    }

    public boolean parameterizedEmail(String email, boolean status) throws UserRegistrationException {
        Predicate<String> check = n -> n.matches(emailPattern);
        try {
            boolean returnVal;
            if (check.test(email))
            {
                System.out.println("Valid email");returnVal = true;
            } else {
                System.out.println("Invalid email");
                returnVal = false;
            }
            if (status == returnVal)
                return true;
            return false;
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid email");
        }
    }
}


