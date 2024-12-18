
package com.quizapp.model;

public class QuizSummary {

    private long total;
    private long correct;
    private long incorrect;

    public QuizSummary(long total, long correct, long incorrect) {
        this.total = total;
        this.correct = correct;
        this.incorrect = incorrect;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getCorrect() {
        return correct;
    }

    public void setCorrect(long correct) {
        this.correct = correct;
    }

    public long getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(long incorrect) {
        this.incorrect = incorrect;
    }
}
