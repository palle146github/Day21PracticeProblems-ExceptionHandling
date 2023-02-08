package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws UserRegistrationException {
        UserRegistrationExceptionHandling userRegistrationImplementation = new UserRegistrationExceptionHandling();
        Scanner scanner = new Scanner(System.in);
        userRegistrationImplementation.clearAllSampleEmail();
        System.out.println("********Welcome to User Registration using RegEx*********");

        System.out.println("Enter First name");
        String firstName = scanner.next();
        userRegistrationImplementation.validateFirstname(firstName);
        System.out.println("");

        System.out.println("Enter Last name");
        String lastName = scanner.next();
        userRegistrationImplementation.validateLastname(lastName);
        System.out.println("");

        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.next();
        userRegistrationImplementation.validatePhoneNumber(phoneNumber);
        System.out.println("");

        System.out.println("Enter Email");
        String email = scanner.next();
        userRegistrationImplementation.validateEmail(email);
        System.out.println("");

        System.out.println("Enter Password");
        String passWord = scanner.next();
        userRegistrationImplementation.validatePassword(passWord);
        System.out.println("");
    }
    }

