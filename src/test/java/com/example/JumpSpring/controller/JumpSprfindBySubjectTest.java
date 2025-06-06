package com.example.JumpSpring.controller;

import com.example.JumpSpring.dto.Question;
import com.example.JumpSpring.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JumpSprfindBySubjectTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요");
        assertEquals(1, q.getId());
    }
}
