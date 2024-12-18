
package com.quizapp.model;

public class SubmissionResult {

    private Long questionId;
    private boolean isCorrect;

    public SubmissionResult(Long questionId, boolean isCorrect) {
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
