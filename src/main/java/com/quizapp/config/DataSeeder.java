
package com.quizapp.config;

import com.quizapp.model.Question;
import com.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class DataSeeder {

    @Autowired
    private QuestionRepository questionRepository;

    @PostConstruct
    public void seedData() {
        if (questionRepository.count() == 0) {
            questionRepository.save(new Question("What is the capital of France?", "Paris", Arrays.asList("Paris", "London", "Rome", "Berlin")));
            questionRepository.save(new Question("What is 2 + 2?", "4", Arrays.asList("3", "4", "5", "6")));
        }
    }
}
