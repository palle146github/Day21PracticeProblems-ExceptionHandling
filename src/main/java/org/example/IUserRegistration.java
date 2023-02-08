package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface IUserRegistration {
    public boolean validateFirstname(String firstName);
    public boolean validateLastname(String lastName);
    public boolean validatePhoneNumber(String phoneNumber);
    public boolean validateEmail(String email);
    public boolean validatePassword(String password);

}
