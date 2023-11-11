package com.example.demo;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(quizController.class)
public class EmailValidatorTest {

    @Test
    public void testValidEmail2() {
        assertTrue(EmailValidator.isEmailValid("123@gmail.com"));
    }
    @Test
    public void testInvalidEmail() {
        assertFalse(EmailValidator.isEmailValid("invalid email"));
    }

}
