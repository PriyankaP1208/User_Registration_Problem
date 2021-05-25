package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args)
    {
        String firstName,lastName,email;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Name:");
        firstName=sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}",firstName))
        {
            System.out.println("Valid first Name");
        }
        else
        {
            System.out.println("Invalid first Name");
        }
        System.out.println("Enter Last name");
        lastName = sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName))
        {
            System.out.println("Valid last Name");
        }
        else
        {
            System.out.println("Invalid last Name");
        }
        System.out.println("Enter Email:");
        email=sc.nextLine();
        if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email))
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }
}
