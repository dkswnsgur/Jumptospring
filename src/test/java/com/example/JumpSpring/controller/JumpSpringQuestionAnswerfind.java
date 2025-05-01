/*
package com.example.JumpSpring.HelloController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Optional;

import com.example.JumpSpring.Entity.Answer;
import com.example.JumpSpring.Entity.Question;
import com.example.JumpSpring.dto.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class JumpSpringQuestionAnswerfind { //질문데이터에서 답변데이트 찾기

    @Autowired
    private QuestionRepository questionRepository;

    @Transactional
    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동적으로 생성됩니다.", answerList.get(0).getContent());
    }
}
*/
