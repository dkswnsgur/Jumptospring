package com.example.JumpSpring.controller;

import com.example.JumpSpring.dto.Question;
import com.example.JumpSpring.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JumpSpringfindBySubjectLikeTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요", q.getSubject());
    }

}
