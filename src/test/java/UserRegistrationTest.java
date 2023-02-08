import com.bridgelabz.exceptionhandling.UserRegistrationExceptionHandling;
import com.bridgelabz.exceptionhandling.UserRegistrationException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    UserRegistrationExceptionHandling userreg;
    @Before
    public void init(){
                userreg = new UserRegistrationExceptionHandling();
    }

    @Test
    public void testFirstName() throws UserRegistrationException {
        try{
            String testFName = "sWati";
            userreg.validateFirstname(testFName);
        }catch(UserRegistrationException e) {
            assertEquals("Invalid First Name", userreg.validateFirstname(e.getMessage()));
        }
    }
    @Test
    public void testLastName() throws UserRegistrationException {
        try{
            String testLName = "sWati";
            userreg.validateLastname(testLName);
        }catch(UserRegistrationException e){
        assertEquals("Enter Valid Last Name", userreg.validateLastname(e.getMessage()));}
    }
    @Test
    public void testPhoneNumber() throws UserRegistrationException {
        try{
            String phoneNumber = "86648468";
            userreg.validatePhoneNumber(phoneNumber);
        }catch(UserRegistrationException e){
        assertEquals("Enter Valid Phone Number", userreg.validatePhoneNumber(e.getMessage()));}
    }

    @Test
    public void testEmail() throws UserRegistrationException {
        try{
            String email = "86648468";
            userreg.validateEmail(email);
        }catch(UserRegistrationException e){
        assertEquals("Invalid", userreg.validateEmail(e.getMessage()));}
    }

    @Test
    public void testPassword() throws UserRegistrationException {
        try{
            String passWord = "86648468";
            userreg.validateEmail(passWord);
        }catch(UserRegistrationException e){
        assertEquals("Enter Valid Password ", userreg.validateEmail(e.getMessage()));}
    }
}
