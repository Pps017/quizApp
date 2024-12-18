
package com.quizapp.model;

public class Submission {

    private Question question;
    private boolean isCorrect;

    public Submission(Question question, boolean isCorrect) {
        this.question = question;
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
