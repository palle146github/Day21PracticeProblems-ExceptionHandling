package org.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImplementation  implements IUserRegistration{

    @Override
    public boolean validateFirstname(String firstName) {
        String validFirstName = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Happy");
            return true;
        }
        else {
            System.out.println("Sad");
            return false;
        }
    }

    @Override
    public boolean validateLastname(String lastName) {
        String validLastName = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(validLastName);
        Matcher matcher = pattern.matcher(lastName);
        if(matcher.matches()){
            System.out.println("Happy");
            return true;
        }
        else {
            System.out.println("Sad");
            return false;
        }
    }

    @Override
    public boolean validatePhoneNumber(String phoneNumber) {
        String validPhoneNumber = "^[1-9]{2}[ ][1-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(validPhoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            System.out.println("Happy");
            return true;
        }
        else {
            System.out.println("Sad");
            return false;
        }
    }

    @Override
    public boolean validateEmail(String email) {
        String validemail = "^[a-z0-9]{1,}[+.-]?([a-z0-9])+[@]([a-z0-9]{1,})+([.][a-z]{2,})([.][a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(validemail);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Happy");
            return true;
        }
        else {
            System.out.println("Sad");
            return false;
        }
    }

    @Override
    public boolean validatePassword(String passWord) {
        String validPassWord = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>])(?!.*[!@#$%^&*(),.?\":{}|<>]{2,})([A-Za-z0-9!@#$%^&*(),.?\":{}|<>]{8,})$";
        Pattern pattern = Pattern.compile(validPassWord);
        Matcher matcher = pattern.matcher(passWord);
        if(matcher.matches()){
            System.out.println("Happy");
            return true;
        }
        else {
            System.out.println("Sad");
            return false;
        }
    }
    public void clearAllSampleEmail() {
    UserRegistrationImplementation userRegistrationImplementation = new UserRegistrationImplementation();
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
