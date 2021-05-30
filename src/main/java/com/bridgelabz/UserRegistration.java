package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePatter = "^[A-Z]{1}[a-z]{2,}$";
    String emailPattern = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
    String mobilePattern = "^[0-9]{2} [0-9]{10}$";
    String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,32}$";

    //Validate first name
    public boolean validFirstName(String fname)
    {
        if(Pattern.matches(namePatter, fname))
        {
            System.out.println("Valid First Name");
            return true;
        }
        else
        {
            System.out.println("Invalid First Name");
            return false;
        }
    }

    //Validate last name
    public boolean validLastName(String lname)
    {
        if(Pattern.matches(namePatter, lname))
        {
            System.out.println("Valid last Name");
            return true;
        }
        else
        {
            System.out.println("Invalid last Name");
            return false;
        }
    }

    //Validate email address
    public boolean validEmail(String email){
        if(Pattern.matches(emailPattern, email))
        {
            System.out.println("Valid email");
            return true;
        }
        else
        {
            System.out.println("Invalid email");
            return false;
        }
    }

    //Validate phone number
    public boolean validMobile(String phoneNo){
        if(Pattern.matches(mobilePattern, phoneNo))
        {
            System.out.println("Valid mobile number");
            return true;
        }
        else
        {
            System.out.println("Invalid mobile number");
            return false;
        }
    }

    //validate password
    public boolean validPassword(String password){
        if(Pattern.matches(passwordPattern, password))
        {
            System.out.println("Valid Password");
            return true;
        }
        else
        {
            System.out.println("Invalid Password");
            return false;
        }
    }
    public boolean parameterizedEmail(String email, boolean status)
    {
        boolean returnVal;
        if(Pattern.matches(emailPattern, email))
        {
            System.out.println("Valid email");
            returnVal= true;
        }
        else
        {
            System.out.println("Invalid email");
            returnVal= false;
        }
        if(status == returnVal)
            return true;
        return false;
    }
}

