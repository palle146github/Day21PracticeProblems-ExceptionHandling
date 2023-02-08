
import com.bridgelabz.exceptionhandling.UserRegistrationException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.bridgelabz.exceptionhandling.UserRegistrationExceptionHandling;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(Parameterized.class)

public class UserRegistrationParamterizedTest {

    private String email;
    private boolean expectedResult;

    UserRegistrationExceptionHandling userinput;


    public UserRegistrationParamterizedTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void init(){
        userinput = new UserRegistrationExceptionHandling();
    }
    @Parameterized.Parameters
    public static Collection emailParamImput() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true}, {"abc-100@abc.net", true},
                {"abc.100@yahoo.com", true},{"abc.100@abc.com.au", true},
                {"abc111@abc.com", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}, {"abc", false},{"abc@.com.my", false},
                {"abc123@gmail.a", false},{"abc123@.com", false},{".abc@abc.com", false},
                {"abc()*@gmail.com", false},{"abc123@.com.com", false},{"abc@%*.com", false},
                {"abc..2002@gmail.com", false},{"abc.@gmail.com", false},{"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},{"abc@gmail.com.aa.au", false}});
    }
    @Test
    public void testEmail() throws UserRegistrationException {
        try{
            userinput.validateEmail(email);
        } catch (UserRegistrationException e) {
            assertEquals(expectedResult, userinput.validateEmail(email));
        }

    }
}

