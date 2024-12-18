
package com.quizapp.controller;

import com.quizapp.model.*;
import com.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
    public ResponseEntity<QuizSession> startNewQuizSession() {
        return ResponseEntity.ok(quizService.startNewQuizSession());
    }

    @GetMapping("/question")
    public ResponseEntity<Question> getRandomQuestion(@RequestParam UUID sessionId) {
        return ResponseEntity.ok(quizService.getRandomQuestion(sessionId));
    }

    @PostMapping("/submit")
    public ResponseEntity<SubmissionResult> submitAnswer(@RequestParam UUID sessionId,
                                                          @RequestParam Long questionId,
                                                          @RequestParam String answer) {
        return ResponseEntity.ok(quizService.submitAnswer(sessionId, questionId, answer));
    }

    @GetMapping("/summary")
    public ResponseEntity<QuizSummary> getQuizSummary(@RequestParam UUID sessionId) {
        return ResponseEntity.ok(quizService.getQuizSummary(sessionId));
    }
}
