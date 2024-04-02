package com.example.jumpToJava.answer;

import com.example.jumpToJava.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
