package com.bridgelabz.exceptionhandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationExceptionHandling {

        public String validateFirstname(String firstName) throws UserRegistrationException {
        String validFirstName = "^[A-Z][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if (firstName.length() == 0) {
                throw new UserRegistrationException("Invalid First Name");
            }
            if (matcher.matches()) {
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid First Name");
            }
        } catch (UserRegistrationException exception) {
            System.out.println(exception.getMessage());
        }
        return validFirstName;
    }
    public String validateLastname(String lastName) throws UserRegistrationException {
        String validLasttName = "^[A-Z][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(validLasttName);
        Matcher matcher = pattern.matcher(lastName);
        try {
            if (lastName.length() == 0) {
                throw new UserRegistrationException("Enter Valid Last Name");
            }
            if (matcher.matches()) {
                return "Valid";
            } else {
                throw new UserRegistrationException("Enter Valid Last Name");
            }
        } catch (UserRegistrationException e){
        System.out.println(e.getMessage());}
        return validLasttName;

    }
    public String validatePhoneNumber(String phoneNumber) throws UserRegistrationException {
        String validPhoneNumber = "^[1-9]{2}[ ][1-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(validPhoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber);
        try {
            if (validPhoneNumber.length() == 0) {
                throw new UserRegistrationException("Enter Valid Phone Number");
            }
            if (matcher.matches()) {
                return "Valid";
            } else {
                throw new UserRegistrationException("Enter Valid Phone Number");
            }
        } catch (UserRegistrationException e){
        System.out.println(e.getMessage());}

        return validPhoneNumber;
    }
    public String validateEmail(String email) throws UserRegistrationException {
        String validEmail = "^[a-z0-9]{1,}[+.-]?([a-z0-9])+[@]([a-z0-9]{1,})+([.][a-z]{2,})([.][a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(validEmail);
        Matcher matcher = pattern.matcher(email);
        try {
            if (email.length() == 0) {
                throw new UserRegistrationException("Invalid");
            }
            if (matcher.matches()) {
                throw new UserRegistrationException("Valid");
            } else {
                throw new UserRegistrationException("Invalid");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return validEmail;
    }

    //
    public String validatePassword(String passWord) throws UserRegistrationException {
        String validPassword = "^[a-z0-9]{1,}[+.-]?([a-z0-9])+[@]([a-z0-9]{1,})+([.][a-z]{2,})([.][a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(validPassword);
        Matcher matcher = pattern.matcher(passWord);
        try {
            if (passWord.length() == 0) {
                throw new UserRegistrationException("Enter Valid Password ");
            }
            if (matcher.matches()) {
                return "Valid";
            } else {
                throw new UserRegistrationException("Enter Valid Password ");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return validPassword;
    }

    public void clearAllSampleEmail() throws UserRegistrationException {
        UserRegistrationExceptionHandling userRegistrationImplementation = new UserRegistrationExceptionHandling();
        System.out.println("Checking all Valid Sample!!!");
        userRegistrationImplementation.validateEmail("abc@yahoo.com");
        userRegistrationImplementation.validateEmail("abc-100@yahoo.com");
        userRegistrationImplementation.validateEmail("abc.100@yahoo.com");
        userRegistrationImplementation.validateEmail("abc111@abc.com");
        userRegistrationImplementation.validateEmail("abc-100@abc.net");
        userRegistrationImplementation.validateEmail("abc.100@abc.com.au");
        userRegistrationImplementation.validateEmail("abc@1.com");
        userRegistrationImplementation.validateEmail("abc@gmail.com.com");
        userRegistrationImplementation.validateEmail("abc+100@gmail.com");
        System.out.println();
        System.out.println("Checking all InValid Sample!!!");
        userRegistrationImplementation.validateEmail("abc");
        userRegistrationImplementation.validateEmail("abc@.com.my");
        userRegistrationImplementation.validateEmail("abc123@gmail.a");
        userRegistrationImplementation.validateEmail("abc123@.com");
        userRegistrationImplementation.validateEmail(".abc@abc.com");
        userRegistrationImplementation.validateEmail("abc()*@gmail.com");
        userRegistrationImplementation.validateEmail("abc123@.com.com");
        userRegistrationImplementation.validateEmail("abc@%*.com");
        userRegistrationImplementation.validateEmail("abc..2002@gmail.com");
        userRegistrationImplementation.validateEmail("abc.@gmail.com");
        userRegistrationImplementation.validateEmail("abc@abc@gmail.com");
        userRegistrationImplementation.validateEmail("abc@gmail.com.1a");
        userRegistrationImplementation.validateEmail("abc@gmail.com.aa.au");
        System.out.println();
    }


}


