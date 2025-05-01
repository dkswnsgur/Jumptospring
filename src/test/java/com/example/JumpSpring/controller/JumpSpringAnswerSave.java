package com.example.JumpSpring.controller;

import com.example.JumpSpring.dto.Answer;
import com.example.JumpSpring.dto.Question;
import com.example.JumpSpring.repository.AnswerRepository;
import com.example.JumpSpring.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class JumpSpringAnswerSave {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q); //어떤질문인지 알기위해 Question 객체가 필요 하다
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);

    }

}
