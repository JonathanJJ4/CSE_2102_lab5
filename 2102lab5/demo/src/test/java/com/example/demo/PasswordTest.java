package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(quizController.class)
public class PasswordTest {
    @Test
    public void testValidPassword() {
        Password password = new Password("abcdABCD12!@", "username01", "username1@gmail.com");
        assertTrue(password.PasswordValidator());
    }

    @Test
    public void testInvalidPassword() {
        Password password = new Password("bad password", "username01", "username1@gmail.com");
        assertFalse(password.PasswordValidator());
    }

}