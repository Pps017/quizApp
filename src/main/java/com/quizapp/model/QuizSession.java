
package com.quizapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QuizSession {

    private UUID sessionId;
    private List<Submission> submissions = new ArrayList<>();

    public QuizSession(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public void addSubmission(Question question, boolean isCorrect) {
        submissions.add(new Submission(question, isCorrect));
    }

    public QuizSummary getSummary() {
        long correct = submissions.stream().filter(Submission::isCorrect).count();
        return new QuizSummary(submissions.size(), correct, submissions.size() - correct);
    }
}
