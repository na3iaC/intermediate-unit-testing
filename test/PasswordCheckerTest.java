import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @ParameterizedTest
    @CsvSource({
            //Test case: Password length is less than 8 chars, no uppercase, has lowercase, no special character
            "abc, Weak, 3",

            //Test case: Password length is exactly 8 characters, no uppercase, no lowercase or special characters
            "12345678,Weak, 8",

            //Test case: Password length is exactly 8 characters, has uppercase and lowercase, no special character
            "Abcdefgh, Average, 8",

            //Test case: Password length is exactly 8 characters, has uppercase and lowercase, no special character
            "Hello123, Average, 8",


            //Test case: Password length is more than 8 characters, has uppercase, lowercase and a special character
            "Strong@123, Strong, 10",

            //Test case: Password length is exactly 8 characters, has uppercase, lowercase and a special character
            "P@ssword, Strong, 8"
    })






    void testAssessPasswordStrength(String password, String expectedStrength, String passwordLength) {
        //assessPasswordStrength method static - don't need an object of PasswordChecker
        //act
        String actualStrength = PasswordChecker.assessPasswordStrength(password);
        //assert
        assertEquals(expectedStrength, actualStrength,
                 "Password of length " + passwordLength + ": " + password + " did not produce expected result of " +
                expectedStrength + ". Instead produced: "+ actualStrength);

    }
}