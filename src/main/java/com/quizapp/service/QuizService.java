
package com.quizapp.service;

import com.quizapp.model.*;
import com.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository questionRepository;

    private final Map<UUID, QuizSession> sessions = new HashMap<>();

    public QuizSession startNewQuizSession() {
        UUID sessionId = UUID.randomUUID();
        QuizSession session = new QuizSession(sessionId);
        sessions.put(sessionId, session);
        return session;
    }

    public Question getRandomQuestion(UUID sessionId) {
        validateSession(sessionId);
        List<Question> questions = questionRepository.findAll();
        if (questions.isEmpty()) {
            throw new IllegalStateException("No questions available.");
        }
        return questions.get(new Random().nextInt(questions.size()));
    }

    public SubmissionResult submitAnswer(UUID sessionId, Long questionId, String answer) {
        validateSession(sessionId);
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Question not found."));
        boolean isCorrect = question.getCorrectAnswer().equalsIgnoreCase(answer);
        sessions.get(sessionId).addSubmission(question, isCorrect);
        return new SubmissionResult(question.getId(), isCorrect);
    }

    public QuizSummary getQuizSummary(UUID sessionId) {
        validateSession(sessionId);
        return sessions.get(sessionId).getSummary();
    }

    private void validateSession(UUID sessionId) {
        if (!sessions.containsKey(sessionId)) {
            throw new IllegalArgumentException("Session not found.");
        }
    }
}
