package com.example.demo;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<Question> questions;

    public QuestionBank() {
        this.questions = new ArrayList<>();
        // Populate the question bank with sample questions.
        Question question1 = new Question(UUID.randomUUID(), "does 1 + 1 = 3?", false);
        Question question2 = new Question(UUID.randomUUID(), "Is the Sun a star?", true);
        Question question3 = new Question(UUID.randomUUID(), "does 2 + 2 = 4?", true);
        Question question4 = new Question(UUID.randomUUID(), "Is yellow a color?", true);
        Question question5 = new Question(UUID.randomUUID(), "Are all cats dogs?", false);
        
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}