package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import java.util.List;

@WebMvcTest(quizController.class)
public class QuestionBankTest {

    @Test
    public void testGetQuestions() {
        QuestionBank questionBank = new QuestionBank();
        List<Question> questions = questionBank.getQuestions();
        assertEquals(5, questions.size());
    }
}
